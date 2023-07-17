package irvine.oeis.a019;

import irvine.math.z.Z;

/**
 * A019578 Place n distinguishable balls in n boxes (in n^n ways); let f(n,k) = number of ways that max in any box is k, for 1&lt;=k&lt;=n; sequence gives f(n,3)/n.
 * @author Sean A. Irvine
 */
public class A019578 extends A019575 {

  /** Construct the sequence. */
  public A019578() {
    super(3);
  }

  private int mN = 2;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    mF = mF.multiply(mN++);
    return get(mN, mN, 3).subtract(get(mN, mN, 2)).multiply(mF).toZ();
  }
}
