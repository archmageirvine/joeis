package irvine.oeis.a105;
// Generated by gen_seq4.pl 2024-03-13/lambdan at 2024-03-19 13:51

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A105080 Number of distinct prime divisors of 10000^n - 3.
 * @author Georg Fischer
 */
public class A105080 extends LambdaSequence {

  /** Construct the sequence. */
  public A105080() {
    super(1, n -> Z.valueOf(Functions.OMEGA.i(Z.valueOf(10000).pow(n).subtract(3))));
  }
}
