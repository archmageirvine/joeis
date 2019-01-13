package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164541.
 * @author Sean A. Irvine
 */
public class A164541 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164541() {
    super(new long[] {-1, 6}, new long[] {1, 15});
  }
}
