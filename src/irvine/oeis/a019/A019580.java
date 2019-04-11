package irvine.oeis.a019;

import irvine.math.z.Z;

/**
 * A019580 Place n distinguishable balls in n boxes (in <code>n^n</code> ways); let f(n,k) = number of ways that max in any box is k, for 1&lt;=k&lt;=n; sequence gives f(n,4)/n.
 * @author Sean A. Irvine
 */
public class A019580 extends A019575 {

  private int mN = 3;
  private Z mF = Z.TWO;

  @Override
  public Z next() {
    mF = mF.multiply(mN++);
    return get(mN, mN, 4).subtract(get(mN, mN, 3)).multiply(mF).toZ();
  }
}
