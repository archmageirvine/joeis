package irvine.oeis.a006;

import irvine.math.plantri.Plantri;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A006791 Number of cyclically-5-connected planar trivalent graphs with 2n nodes.
 * @author Sean A. Irvine
 */
public class A006791 extends AbstractSequence {

  /** Construct the sequence. */
  public A006791() {
    super(10);
  }

  private int mN = 11;

  @Override
  public Z next() {
    return Z.valueOf(new Plantri().count(++mN, -1, 5, -1, false, false, false, false));
  }
}

