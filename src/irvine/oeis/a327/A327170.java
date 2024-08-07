package irvine.oeis.a327;
// Generated by gen_seq4.pl 2024-07-21/lambdan at 2024-07-22 00:06

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A327170 Number of divisors d of n such that A327171(d) (= phi(d)*core(d)) is equal to n.
 * @author Georg Fischer
 */
public class A327170 extends LambdaSequence {

  /** Construct the sequence. */
  public A327170() {
    super(1, n -> Integers.SINGLETON.sumdiv(n, d -> Functions.PHI.z(d).multiply(Functions.CORE.z(d)).equals(Z.valueOf(n)) ? Z.ONE : Z.ZERO));
  }
}
