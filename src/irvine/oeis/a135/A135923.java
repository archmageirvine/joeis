package irvine.oeis.a135;

import irvine.oeis.LinearRecurrence;

/**
 * A135923.
 * @author Sean A. Irvine
 */
public class A135923 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135923() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {0, 35, 1430, 13941, 75205, 289800, 897165, 2379300, 5620846});
  }
}
