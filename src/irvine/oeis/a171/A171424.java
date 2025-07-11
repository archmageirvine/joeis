package irvine.oeis.a171;
// Generated by gen_seq4.pl 2025-06-03.ack/lambdan at 2025-06-03 20:14

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A171424 (n-1)^(p-n+1)+n where p is the smallest prime &gt; n-1.
 * @author Georg Fischer
 */
public class A171424 extends LambdaSequence {

  /** Construct the sequence. */
  public A171424() {
    super(1, n -> Z.valueOf(n - 1).pow(Functions.NEXT_PRIME.i(n - 1) - n + 1).add(n));
  }
}
