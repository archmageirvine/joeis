package irvine.oeis.a280;

import irvine.oeis.LinearRecurrence;

/**
 * A280059.
 * @author Sean A. Irvine
 */
public class A280059 extends LinearRecurrence {

  /** Construct the sequence. */
  public A280059() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 45, 225, 637});
  }
}
