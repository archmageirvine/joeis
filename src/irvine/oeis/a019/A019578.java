package irvine.oeis.a019;

import irvine.math.z.Z;

/**
 * A019578 Place n distinguishable balls in n boxes <code>(in n^n</code> ways); let <code>f(n,k) =</code> number of ways that max in <code>any</code> box is k, for <code>1&lt;=k&lt;=n</code>; sequence gives <code>f(n,3)/n</code>.
 * @author Sean A. Irvine
 */
public class A019578 extends A019575 {

  private int mN = 2;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    mF = mF.multiply(mN++);
    return get(mN, mN, 3).subtract(get(mN, mN, 2)).multiply(mF).toZ();
  }
}
