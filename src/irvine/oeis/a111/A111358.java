package irvine.oeis.a111;

import irvine.math.plantri.Plantri;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A111358 Numbers of planar triangulations with minimum degree 5 and without separating 3- or 4-cycles - that is 3- or 4-cycles where the interior and exterior contain at least one vertex.
 * @author Sean A. Irvine
 */
public class A111358 extends AbstractSequence {

  /* Construct the sequence. */
  public A111358() {
    super(12);
  }

  private int mN = 11;

  @Override
  public Z next() {
    return Z.valueOf(new Plantri().count(++mN, -1, 5, -1, false, false, false, false));
  }
}

