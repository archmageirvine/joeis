package irvine.oeis.a019;

import irvine.math.z.Z;

/**
 * A019576 Place n distinguishable balls in n boxes (in n^n ways); let f(n,k) = number of ways that max in any box is k, for 1&lt;=k&lt;=n; sequence gives triangle of numbers f(n,k)/n.
 * @author Sean A. Irvine
 */
public class A019576 extends A019575 {

  private int mN = 0;
  private Z mF = Z.ONE;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      if (++mN > 2) {
        mF = mF.multiply(mN - 1);
      }
      mM = 1;
    }
    return get(mN, mN, mM).subtract(get(mN, mN, mM - 1)).multiply(mF).toZ();
  }
}
