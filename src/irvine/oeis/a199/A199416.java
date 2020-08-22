package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199416 2*7^n+1.
 * @author Sean A. Irvine
 */
public class A199416 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199416() {
    super(new long[] {-7, 8}, new long[] {3, 15});
  }
}
