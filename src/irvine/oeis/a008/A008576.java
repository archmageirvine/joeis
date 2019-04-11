package irvine.oeis.a008;

import irvine.oeis.LinearRecurrence;

/**
 * A008576 Coordination sequence for planar net <code>4.8.8</code>.
 * @author Sean A. Irvine
 */
public class A008576 extends LinearRecurrence {

  /** Construct the sequence. */
  public A008576() {
    super(new long[] {0, -1, 1, 0, 1}, new long[] {1, 3, 5, 8, 11});
  }
}

