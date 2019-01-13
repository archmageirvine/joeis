package irvine.oeis.a133;

import irvine.oeis.LinearRecurrence;

/**
 * A133668.
 * @author Sean A. Irvine
 */
public class A133668 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133668() {
    super(new long[] {-36, 1}, new long[] {1, 6});
  }
}
