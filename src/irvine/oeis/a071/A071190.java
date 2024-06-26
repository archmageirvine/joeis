package irvine.oeis.a071;
// Generated by gen_seq4.pl 2024-06-23/lambdan at 2024-06-23 23:33

import irvine.math.function.Functions;
import irvine.oeis.LambdaSequence;

/**
 * A071190 Greatest prime factor of sum of divisors of n, for n &gt;= 2; a(1) = 1.
 * @author Georg Fischer
 */
public class A071190 extends LambdaSequence {

  /** Construct the sequence. */
  public A071190() {
    super(1, n -> Functions.GPF.z(Functions.SIGMA.z(1, n)));
  }
}
