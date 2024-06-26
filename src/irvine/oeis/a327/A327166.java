package irvine.oeis.a327;
// Generated by gen_seq4.pl 2024-06-03/lambdan at 2024-06-03 22:35

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A327166 Number of divisors d of n for which A000005(d)*d is equal to n, where A000005(x) gives the number of divisors of x.
 * @author Georg Fischer
 */
public class A327166 extends LambdaSequence {

  /** Construct the sequence. */
  public A327166() {
    super(1, n -> Integers.SINGLETON.sumdiv(n, d -> Functions.SIGMA0.z(d).multiply(d).equals(Z.valueOf(n)) ? Z.ONE : Z.ZERO));
  }
}
