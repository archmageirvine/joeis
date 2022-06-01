package irvine.oeis.a133;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A133034 First differences of Padovan sequence A000931.
 * @author Sean A. Irvine
 */
public class A133034 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133034() {
    super(new long[] {1, 1, 0}, new long[] {-1, 0, 1});
  }
}
