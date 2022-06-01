package irvine.oeis.a199;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A199027 8*11^n-1.
 * @author Sean A. Irvine
 */
public class A199027 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199027() {
    super(new long[] {-11, 12}, new long[] {7, 87});
  }
}
