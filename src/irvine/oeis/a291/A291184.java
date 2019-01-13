package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291184.
 * @author Sean A. Irvine
 */
public class A291184 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291184() {
    super(new long[] {-1, 8, -17, 8}, new long[] {4, 21, 104, 507});
  }
}
