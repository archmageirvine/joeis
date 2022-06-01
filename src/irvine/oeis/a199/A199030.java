package irvine.oeis.a199;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A199030 10*11^n-1.
 * @author Sean A. Irvine
 */
public class A199030 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199030() {
    super(new long[] {-11, 12}, new long[] {9, 109});
  }
}
