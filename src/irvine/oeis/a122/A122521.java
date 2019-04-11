package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122521 Recursion: <code>a(n) = a(n - 6) + a(n - 8)</code>.
 * @author Sean A. Irvine
 */
public class A122521 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122521() {
    super(new long[] {1, 0, 1, 0, 0, 0, 0, 0}, new long[] {1, 1, 1, 1, 1, 1, 1, 1});
  }
}
