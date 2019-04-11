package irvine.oeis.a056;

import irvine.oeis.LinearRecurrence;

/**
 * A056640 At stage 1, start with a unit square. At each successive stage add <code>4*(n-1)</code> new squares around outside with edge-to-edge contacts. Sequence gives number of squares (regardless of size) at n-th stage.
 * @author Sean A. Irvine
 */
public class A056640 extends LinearRecurrence {

  /** Construct the sequence. */
  public A056640() {
    super(new long[] {-1, 3, -2, -2, 3}, new long[] {1, 5, 18, 42, 83});
  }
}
