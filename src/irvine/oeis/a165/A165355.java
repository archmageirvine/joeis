package irvine.oeis.a165;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A165355 a(n) = 3n + 1 if n is even, or a(n) = (3n + 1)/2 if n is odd.
 * @author Sean A. Irvine
 */
public class A165355 extends LinearRecurrence {

  /** Construct the sequence. */
  public A165355() {
    super(new long[] {-1, 0, 2, 0}, new long[] {1, 2, 7, 5});
  }
}
