package irvine.oeis.a111;

import irvine.oeis.LinearRecurrence;

/**
 * A111587.
 * @author Sean A. Irvine
 */
public class A111587 extends LinearRecurrence {

  /** Construct the sequence. */
  public A111587() {
    super(new long[] {1, 2, 0, 2}, new long[] {1, 4, 9, 20});
  }
}
