package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041610.
 * @author Sean A. Irvine
 */
public class A041610 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041610() {
    super(new long[] {-1, 0, 36, 0}, new long[] {17, 18, 629, 647});
  }
}
