package irvine.oeis.a237;

import irvine.oeis.LinearRecurrence;

/**
 * A237128.
 * @author Sean A. Irvine
 */
public class A237128 extends LinearRecurrence {

  /** Construct the sequence. */
  public A237128() {
    super(new long[] {-1, 1, 1}, new long[] {36, 324, 396});
  }
}
