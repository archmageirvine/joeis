package irvine.oeis.a372;
// Generated by gen_seq4.pl 2024-05-22/lambdan at 2024-05-22 22:35

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A372926 a(n) = Sum_{1 &lt;= x_1, x_2 &lt;= n} gcd(x_1, x_2, n)^4.
 * @author Georg Fischer
 */
public class A372926 extends LambdaSequence {

  /** Construct the sequence. */
  public A372926() {
    super(1, n -> Integers.SINGLETON.sumdiv(n, d -> Functions.MOEBIUS.z(n / d).multiply(Z.valueOf(d).square()).multiply(Functions.SIGMA.z(2, d))));
  }
}
