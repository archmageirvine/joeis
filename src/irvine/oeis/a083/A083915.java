package irvine.oeis.a083;
// Generated by gen_seq4.pl 2024-03-13/lambdan at 2024-03-13 22:10

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A083915 Number of divisors of n that are congruent to 5 modulo 10.
 * @author Georg Fischer
 */
public class A083915 extends LambdaSequence {

  /** Construct the sequence. */
  public A083915() {
    super(1, n -> Integers.SINGLETON.sumdiv(n, d -> (d % 10 == 5) ? Z.ONE : Z.ZERO));
  }
}
