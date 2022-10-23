package irvine.oeis.a049;

import irvine.math.z.InfinitaryDivisors;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A049418 3-i-sigma(n): sum of 3-infinitary divisors of n: if n=Product p(i)^r(i) and d=Product p(i)^s(i), each s(i) has a digit a&lt;=b in its ternary expansion everywhere that the corresponding r(i) has a digit b, then d is a 3-i-divisor of n.
 * @author Sean A. Irvine
 */
public class A049418 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return InfinitaryDivisors.infinitary3Sigma(Z.valueOf(++mN));
  }
}
