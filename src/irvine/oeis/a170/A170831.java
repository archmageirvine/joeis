package irvine.oeis.a170;

import irvine.oeis.LinearRecurrence;

/**
 * A170831.
 * @author Sean A. Irvine
 */
public class A170831 extends LinearRecurrence {

  /** Construct the sequence. */
  public A170831() {
    super(new long[] {-4, 0, 2, 2, 0}, new long[] {2, 2, 4, 4, 10});
  }
}
