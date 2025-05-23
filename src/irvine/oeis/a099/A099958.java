package irvine.oeis.a099;
// Generated by gen_seq4.pl 2025-05-08.ack/filter at 2025-05-08 13:52

import irvine.oeis.FilterSequence;
import irvine.oeis.a049.A049690;

/**
 * A099958 (1/2)*number of distinct angular positions under which an observer positioned at the center of an edge of a square lattice can see the (2n)X(2n-1) points symmetrically surrounding his position.
 * @author Georg Fischer
 */
public class A099958 extends FilterSequence {

  /** Construct the sequence. */
  public A099958() {
    super(1, new A049690(), (n, v) -> (n & 1) == 1);
  }
}
