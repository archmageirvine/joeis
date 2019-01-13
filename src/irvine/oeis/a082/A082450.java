package irvine.oeis.a082;

import irvine.oeis.LinearRecurrence;

/**
 * A082450.
 * @author Sean A. Irvine
 */
public class A082450 extends LinearRecurrence {

  /** Construct the sequence. */
  public A082450() {
    super(new long[] {1, -3, 3}, new long[] {5, 5, 10});
  }
}
