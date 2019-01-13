package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037587.
 * @author Sean A. Irvine
 */
public class A037587 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037587() {
    super(new long[] {-8, 1, 8}, new long[] {3, 25, 203});
  }
}
