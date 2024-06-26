package irvine.oeis.a365;
// Generated by gen_seq4.pl knowna4/simtraf at 2023-09-26 19:28

import irvine.math.function.Functions;
import irvine.oeis.a053.A053167;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A365492 The number of divisors of the smallest 4th power divisible by n.
 * @author Georg Fischer
 */
public class A365492 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A365492() {
    super(1, new A053167(), v -> Functions.SIGMA0.z(v));
  }
}
