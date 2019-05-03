package irvine.oeis.a019;

import irvine.math.z.Z;

/**
 * A019579 Place n distinguishable balls in n boxes <code>(in n^n ways)</code>; let <code>f(n,k) =</code> number of ways that max in any box is k, for <code>1&lt;=k&lt;=n</code>; sequence gives <code>f(n,n-2)/n</code>.
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
