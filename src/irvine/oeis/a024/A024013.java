package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024013 2^n-n^3.
 * @author Sean A. Irvine
 */
public class A024013 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024013() {
    super(new long[] {2, -9, 16, -14, 6}, new long[] {1, 1, -4, -19, -48});
  }
}
