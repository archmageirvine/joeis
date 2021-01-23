package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016051 Numbers of the form 9n+3 or 9n+6.
 * @author Sean A. Irvine
 */
public class A016051 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016051() {
    super(new long[] {-1, 1, 1}, new long[] {3, 6, 12});
  }
}
