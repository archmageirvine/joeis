package irvine.oeis.a000;

import irvine.oeis.LinearRecurrence;

/**
 * A000383 Hexanacci numbers with <code>a(0) = ... = a(5) = 1</code>.
 * @author Sean A. Irvine
 */
public class A000383 extends LinearRecurrence {

  /** Construct the sequence. */
  public A000383() {
    super(new long[] {1, 1, 1, 1, 1, 1}, new long[] {1, 1, 1, 1, 1, 1});
  }
}
