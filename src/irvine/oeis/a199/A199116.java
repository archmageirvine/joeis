package irvine.oeis.a199;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A199116 a(n) = 6*4^n+1.
 * @author Sean A. Irvine
 */
public class A199116 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199116() {
    super(new long[] {-4, 5}, new long[] {7, 25});
  }
}
