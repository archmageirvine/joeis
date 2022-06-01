package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017629 a(n) = 12*n + 9.
 * @author Sean A. Irvine
 */
public class A017629 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017629() {
    super(new long[] {-1, 2}, new long[] {9, 21});
  }
}
