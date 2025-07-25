package irvine.oeis.a386;
// Generated by gen_seq4.pl 2025-07-21.ack/holos at 2025-07-21 18:34

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A386226 The maximum possible number of 8-cycles in an outerplanar graph on n vertices.
 * @author Georg Fischer
 */
public class A386226 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A386226() {
    super(8, "[0,-1,1,0,0,1,-1]", "1,4,10,16,27,34,44,54,69", 0, 0);
  }
}
