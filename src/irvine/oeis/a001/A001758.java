package irvine.oeis.a001;

import irvine.math.z.Z;

/**
 * A001758 Number of quasi-alternating permutations of length n.
 * @author Sean A. Irvine
 */
public class A001758 extends A001250 {

  {
    super.next();
    super.next();
  }

  protected Z mT = super.next();
  protected Z mA1758;

  @Override
  public Z next() {
    final Z t = super.next();
    final Z r = t.subtract(mT.multiply2());
    mT = t;
    mA1758 = r;
    return r;
  }
}
