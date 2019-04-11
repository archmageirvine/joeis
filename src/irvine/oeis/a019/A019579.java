package irvine.oeis.a019;

import irvine.math.z.Z;

/**
 * A019579 Place n distinguishable balls in n boxes (in <code>n^n</code> ways); let f(n,k) = number of ways that max in any box is <code>k,</code> for <code>1&lt;=k&lt;=n</code>; sequence gives f(n,n-2)/n.
 * @author Sean A. Irvine
 */
public class A019579 extends A019575 {

  private int mN = 2;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    mF = mF.multiply(mN++);
    return get(mN, mN, mN - 2).subtract(get(mN, mN, mN - 3)).multiply(mF).toZ();
  }
}
