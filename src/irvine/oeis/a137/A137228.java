package irvine.oeis.a137;
// Generated by gen_seq4.pl 2024-11-19.ack/sintrif at 2024-11-19 23:27

import irvine.math.z.Z;
import irvine.oeis.a067.A067628;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A137228 Minimal total number of edges in a polyiamond consisting of n triangular cells.
 * @author Georg Fischer
 */
public class A137228 extends SingleTransformSequence {

  /** Construct the sequence. */
  public A137228() {
    super(1, (term, n) -> Z.valueOf(3L * n).add(term).divide(2), "", new A067628());
  }
}
