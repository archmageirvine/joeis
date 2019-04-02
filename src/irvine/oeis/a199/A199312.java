package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199312 (9*5^n+1)/2.
 * @author Sean A. Irvine
 */
public class A199312 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199312() {
    super(new long[] {-5, 6}, new long[] {5, 23});
  }
}
