package irvine.oeis.a063;

import irvine.oeis.LinearRecurrence;

/**
 * A063436 Write <code>1,2,3,4,</code>... counterclockwise in a hexagonal spiral around 0 starting left down, then <code>a(n)</code> is the sequence found by reading from 0 in the vertical upward direction.
 * @author Sean A. Irvine
 */
public class A063436 extends LinearRecurrence {

  /** Construct the sequence. */
  public A063436() {
    super(new long[] {1, -3, 3}, new long[] {0, 15, 54});
  }
}
