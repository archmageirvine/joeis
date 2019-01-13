package irvine.oeis.a167;

import irvine.oeis.LinearRecurrence;

/**
 * A167587.
 * @author Sean A. Irvine
 */
public class A167587 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167587() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {789, 4077, 13269, 33165, 70485});
  }
}
