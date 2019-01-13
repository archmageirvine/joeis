package irvine.oeis.a202;

import irvine.oeis.LinearRecurrence;

/**
 * A202606.
 * @author Sean A. Irvine
 */
public class A202606 extends LinearRecurrence {

  /** Construct the sequence. */
  public A202606() {
    super(new long[] {1000, -1110, 111}, new long[] {1, 2, 67});
  }
}
