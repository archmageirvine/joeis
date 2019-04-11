package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199489 <code>(11*7^n+1)/6</code>.
 * @author Sean A. Irvine
 */
public class A199489 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199489() {
    super(new long[] {-7, 8}, new long[] {2, 13});
  }
}
