package irvine.oeis.a283;
// Generated by gen_seq4.pl 2024-06-17/simtraf at 2024-06-17 23:19

import irvine.math.function.Functions;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A283985 Sums of distinct terms of A143293: a(n) = Sum_{k&gt;=0} A030308(n,k)*A143293(k).
 * @author Georg Fischer
 */
public class A283985 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A283985() {
    super(0, new A283477(), v -> Functions.PRIMORIAL_BASE_LOG.z(v));
  }
}
