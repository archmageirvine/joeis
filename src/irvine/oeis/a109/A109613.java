package irvine.oeis.a109;

import irvine.oeis.LinearRecurrence;

/**
 * A109613 Odd numbers repeated.
 * @author Sean A. Irvine
 */
public class A109613 extends LinearRecurrence {

  /** Construct the sequence. */
  public A109613() {
    super(new long[] {-1, 1, 1}, new long[] {1, 1, 3});
  }
}
