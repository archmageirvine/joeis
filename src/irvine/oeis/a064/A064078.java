package irvine.oeis.a064;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064078 Zsigmondy numbers for a = 2, b = 1: Zs(n, 2, 1) is the greatest divisor of 2^n - 1 (A000225) that is coprime to 2^m - 1 for all positive integers m &lt; n.
 * @author Sean A. Irvine
 */
public class A064078 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    final Z c = Functions.CYCLOTOMIC.z(++mN, 2);
    return c.divide(c.gcd(Z.valueOf(mN)));
  }
}
