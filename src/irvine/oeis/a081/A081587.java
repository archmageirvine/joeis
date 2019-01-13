package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081587.
 * @author Sean A. Irvine
 */
public class A081587 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081587() {
    super(new long[] {1, -3, 3}, new long[] {1, 11, 46});
  }
}
