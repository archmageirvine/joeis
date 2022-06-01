package irvine.oeis.a207;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A207809 Number of 4 X n 0..1 arrays avoiding 0 0 0 and 0 0 1 horizontally and 0 1 0 and 1 0 1 vertically.
 * @author Sean A. Irvine
 */
public class A207809 extends LinearRecurrence {

  /** Construct the sequence. */
  public A207809() {
    super(new long[] {1, 1, -12, 4, 13, 2}, new long[] {10, 100, 370, 1970, 9040, 43990});
  }
}
