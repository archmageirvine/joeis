package irvine.oeis.a107;

import irvine.oeis.LinearRecurrence;

/**
 * A107903.
 * @author Sean A. Irvine
 */
public class A107903 extends LinearRecurrence {

  /** Construct the sequence. */
  public A107903() {
    super(new long[] {-4, 8}, new long[] {1, 10});
  }
}
