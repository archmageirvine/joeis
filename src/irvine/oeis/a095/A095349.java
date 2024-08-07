package irvine.oeis.a095;
// Generated by gen_seq4.pl 2024-07-31/sintrif at 2024-07-31 22:55

import irvine.math.z.Z;
import irvine.oeis.a000.A000055;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A095349 Total number of edges in all trees on n nodes.
 * @author Georg Fischer
 */
public class A095349 extends SingleTransformSequence {

  /** Construct the sequence. */
  public A095349() {
    super(1, (term, n) -> Z.valueOf(n - 1).multiply(term), "", new A000055());
  }
}
