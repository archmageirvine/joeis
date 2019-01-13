package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164031.
 * @author Sean A. Irvine
 */
public class A164031 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164031() {
    super(new long[] {-23, 10}, new long[] {1, 8});
  }
}
