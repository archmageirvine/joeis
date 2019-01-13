package irvine.oeis.a072;

import irvine.oeis.LinearRecurrence;

/**
 * A072827.
 * @author Sean A. Irvine
 */
public class A072827 extends LinearRecurrence {

  /** Construct the sequence. */
  public A072827() {
    super(new long[] {-1, -1, 0, -1, -1, 6, 5, 3, 2, 1}, new long[] {1, 2, 6, 18, 46, 115, 301, 792, 2068, 5380});
  }
}
