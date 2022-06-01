package irvine.oeis.a078;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A078787 a(n) = 101*n + 1.
 * @author Sean A. Irvine
 */
public class A078787 extends LinearRecurrence {

  /** Construct the sequence. */
  public A078787() {
    super(new long[] {-1, 2}, new long[] {1, 102});
  }
}
