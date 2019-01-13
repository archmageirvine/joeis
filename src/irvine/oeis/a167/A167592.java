package irvine.oeis.a167;

import irvine.oeis.LinearRecurrence;

/**
 * A167592.
 * @author Sean A. Irvine
 */
public class A167592 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167592() {
    super(new long[] {-16, 32, -24, 8}, new long[] {-2, -8, -16, 0});
  }
}
