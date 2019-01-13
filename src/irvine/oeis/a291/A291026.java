package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291026.
 * @author Sean A. Irvine
 */
public class A291026 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291026() {
    super(new long[] {-1, 8, -15, 8}, new long[] {4, 23, 128, 711});
  }
}
