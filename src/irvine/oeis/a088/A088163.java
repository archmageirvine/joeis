package irvine.oeis.a088;

import irvine.oeis.LinearRecurrence;

/**
 * A088163.
 * @author Sean A. Irvine
 */
public class A088163 extends LinearRecurrence {

  /** Construct the sequence. */
  public A088163() {
    super(new long[] {-4, 0, 0, 5, 0, 0}, new long[] {0, 1, 2, 3, 7, 10});
  }
}
