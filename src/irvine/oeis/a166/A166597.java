package irvine.oeis.a166;
// Generated by gen_seq4.pl 2025-02-03.ack/lambdan at 2025-02-03 18:14

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a001.A001223;

/**
 * A166597 Let p = largest prime &lt;= n, with p(0)=p(1)=0, and let q = smallest prime &gt; n; then a(n) = q-p.
 * @author Georg Fischer
 */
public class A166597 extends LambdaSequence {

  private static final DirectSequence A001223 = new A001223();

  /** Construct the sequence. */
  public A166597() {
    super(0, n -> (n <= 1) ? Z.TWO : A001223.a(Functions.PRIME_PI.z(n)));
  }
}
