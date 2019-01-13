package irvine.oeis.a133;

import irvine.oeis.LinearRecurrence;

/**
 * A133629.
 * @author Sean A. Irvine
 */
public class A133629 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133629() {
    super(new long[] {-5, 5, 1}, new long[] {1, 5, 10});
  }
}
