package irvine.oeis.a173;
// Generated by gen_seq4.pl knowna4/simtraf at 2023-09-26 19:28

import irvine.math.function.Functions;
import irvine.oeis.a000.A000225;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A173301 a(n) = A000041(2^n - 1).
 * @author Georg Fischer
 */
public class A173301 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A173301() {
    super(0, new A000225(), Functions.PARTITIONS::z);
  }
}
