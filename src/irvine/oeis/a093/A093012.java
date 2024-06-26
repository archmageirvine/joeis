package irvine.oeis.a093;
// Generated by gen_seq4.pl knowna4/simtraf at 2023-09-26 19:28

import irvine.math.function.Functions;
import irvine.oeis.a091.A091968;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A093012 Numbers k such that prime(k) == 3 (mod 16).
 * @author Georg Fischer
 */
public class A093012 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A093012() {
    super(1, new A091968(), v -> Functions.PRIME_PI.z(v));
  }
}
