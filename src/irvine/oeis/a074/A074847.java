package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074847 Sum of 4-infinitary divisors of n: if n=Product p(i)^r(i) and d=Product p(i)^s(i), each s(i) has a digit a&lt;=b in its 4-ary expansion everywhere that the corresponding r(i) has a digit b, then d is a 4-infinitary-divisor of n.
 * @author Sean A. Irvine
 */
public class A074847 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Functions.INFINITARY_SIGMA1.z(4, Z.valueOf(++mN));
  }
}
