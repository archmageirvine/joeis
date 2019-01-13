package irvine.oeis.a143;

import irvine.oeis.LinearRecurrence;

/**
 * A143941.
 * @author Sean A. Irvine
 */
public class A143941 extends LinearRecurrence {

  /** Construct the sequence. */
  public A143941() {
    super(new long[] {-1, 4, -6, 4}, new long[] {3, 14, 37, 76});
  }
}
