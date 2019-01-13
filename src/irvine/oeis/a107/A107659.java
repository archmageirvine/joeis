package irvine.oeis.a107;

import irvine.oeis.LinearRecurrence;

/**
 * A107659.
 * @author Sean A. Irvine
 */
public class A107659 extends LinearRecurrence {

  /** Construct the sequence. */
  public A107659() {
    super(new long[] {-4, 2, 2}, new long[] {1, 4, 10});
  }
}
