package irvine.oeis.a135;

import irvine.oeis.LinearRecurrence;

/**
 * A135659 a(n) = 24*n + 7.
 * @author Sean A. Irvine
 */
public class A135659 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135659() {
    super(new long[] {-1, 2}, new long[] {7, 31});
  }
}
