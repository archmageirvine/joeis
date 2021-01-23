package irvine.oeis.a001;

import irvine.math.z.Z;

/**
 * A001760 Number of permutations of [n] with n-4 sequences.
 * @author Sean A. Irvine
 */
public class A001760 extends A001759 {

  {
    super.next();
  }

  private int mN = 2;
  private Z mW = mA1758;
  private Z mC = super.next();

  @Override
  public Z next() {
    final Z w = mA1758;
    final Z t = super.next();
    final Z r = t.subtract(mW.multiply(++mN)).subtract(mC.multiply2()).divide(3);
    mC = t;
    mW = w;
    return r;
  }
}
