package irvine.oeis.a071;

import irvine.oeis.LinearRecurrence;

/**
 * A071954.
 * @author Sean A. Irvine
 */
public class A071954 extends LinearRecurrence {

  /** Construct the sequence. */
  public A071954() {
    super(new long[] {1, -5, 5}, new long[] {2, 4, 10});
  }
}
