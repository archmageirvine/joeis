package irvine.oeis.a086;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A086746 Multiples of 3018.
 * @author Sean A. Irvine
 */
public class A086746 extends LinearRecurrence {

  /** Construct the sequence. */
  public A086746() {
    super(new long[] {-1, 2}, new long[] {3018, 6036});
  }
}
