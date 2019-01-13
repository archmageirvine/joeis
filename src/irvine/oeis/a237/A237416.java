package irvine.oeis.a237;

import irvine.oeis.LinearRecurrence;

/**
 * A237416.
 * @author Sean A. Irvine
 */
public class A237416 extends LinearRecurrence {

  /** Construct the sequence. */
  public A237416() {
    super(new long[] {-1, 0, 0, 0, 0, 2, 0, 0, 0, 0}, new long[] {10, 20, 30, 40, 5, 60, 70, 80, 90, 10});
  }
}
