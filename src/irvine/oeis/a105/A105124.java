package irvine.oeis.a105;
// Generated by gen_seq4.pl tuptraf/simtraf at 2023-10-28 00:07

import irvine.math.z.Z;
import irvine.oeis.a088.A088594;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A105124 Three-dimensional small Schroeder numbers.
 * @author Georg Fischer
 */
public class A105124 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A105124() {
    super(0, new A088594(), (n, v) -> (n <= 1) ? Z.ONE : v.divide(4));
  }
}
