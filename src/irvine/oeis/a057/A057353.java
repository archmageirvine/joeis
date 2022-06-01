package irvine.oeis.a057;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A057353 a(n) = floor(3n/4).
 * @author Sean A. Irvine
 */
public class A057353 extends LinearRecurrence {

  /** Construct the sequence. */
  public A057353() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {0, 0, 1, 2, 3});
  }
}
