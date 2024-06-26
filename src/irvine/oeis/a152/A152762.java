package irvine.oeis.a152;
// Generated by gen_seq4.pl knowna4/simtraf at 2023-09-26 19:28

import irvine.math.function.Functions;
import irvine.oeis.a000.A000108;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A152762 Sum of proper divisors of Catalan number A000108(n).
 * @author Georg Fischer
 */
public class A152762 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A152762() {
    super(0, new A000108(), v -> Functions.SIGMA1.z(v).subtract(v));
  }
}
