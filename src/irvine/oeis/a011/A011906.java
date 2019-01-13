package irvine.oeis.a011;

import irvine.oeis.LinearRecurrence;

/**
 * A011906.
 * @author Sean A. Irvine
 */
public class A011906 extends LinearRecurrence {

  /** Construct the sequence. */
  public A011906() {
    super(new long[] {1, -41, 246, -246, 41}, new long[] {1, 18, 525, 17340, 586177});
  }
}
