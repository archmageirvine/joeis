package irvine.oeis.a165;

import irvine.oeis.LinearRecurrence;

/**
 * A165355 <code>a(n) = 3n + 1</code> if n is even, or <code>a(n) = (3n + 1)/2</code> if n is odd.
 * @author Sean A. Irvine
 */
public class A165355 extends LinearRecurrence {

  /** Construct the sequence. */
  public A165355() {
    super(new long[] {-1, 0, 2, 0}, new long[] {1, 2, 7, 5});
  }
}
