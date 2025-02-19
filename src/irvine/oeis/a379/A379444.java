package irvine.oeis.a379;
// Generated by gen_seq4.pl 2024-12-30.ack/lambdan at 2024-12-30 19:33

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A379444 a(n) is the difference between the least prime &gt; (n+1)^2 and the largest prime &lt; n^2, divided by 2.
 * @author Georg Fischer
 */
public class A379444 extends LambdaSequence {

  /** Construct the sequence. */
  public A379444() {
    super(2, n -> Functions.NEXT_PRIME.z(Z.valueOf(n + 1).square()).subtract(Functions.PREV_PRIME.z(Z.valueOf(n).square())).divide(2));
  }
}
