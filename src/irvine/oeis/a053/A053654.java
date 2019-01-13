package irvine.oeis.a053;

import irvine.oeis.LinearRecurrence;

/**
 * A053654.
 * @author Sean A. Irvine
 */
public class A053654 extends LinearRecurrence {

  /** Construct the sequence. */
  public A053654() {
    super(new long[] {-1, 2}, new long[] {123456789, 246913578});
  }
}
