package irvine.oeis.a323;
// manually transpose at 2021-11-10

import irvine.math.z.Z;

/**
 * A323231 A(n, k) = [x^k] (1/(1-x) + x/(1-x)^n), square array read by descending antidiagonals for n, k &gt;= 0.
 * @author Georg Fischer
 */
public class A323231 extends A323211 {

  protected long mN = -1;

  @Override
  public Z next() {
    final Z result = super.next();
    return ++mN == 1 ? Z.TWO : result;
  }
}
