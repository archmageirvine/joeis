package irvine.oeis.a156;

import irvine.oeis.LinearRecurrence;

/**
 * A156853 <code>2025n^2 - 649n + 52</code>.
 * @author Sean A. Irvine
 */
public class A156853 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156853() {
    super(new long[] {1, -3, 3}, new long[] {1428, 6854, 16330});
  }
}
