package irvine.oeis.a111;

import irvine.math.plantri.Plantri;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A111358 Numbers of planar triangulations with minimum degree 5 and without separating 3- or <code>4-cycles -</code> that is 3- or 4-cycles where the interior and exterior contain at least one vertex.
 * @author Sean A. Irvine
 */
public class A111358 implements Sequence {

  private int mN = 11;

  @Override
  public Z next() {
    return Z.valueOf(new Plantri().count(++mN, -1, 5, -1, false, false, false, false));
  }
}

