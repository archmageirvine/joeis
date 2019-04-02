package irvine.oeis.a193;

import irvine.oeis.LinearRecurrence;

/**
 * A193579 a(n) = 2*4^n + 7.
 * @author Sean A. Irvine
 */
public class A193579 extends LinearRecurrence {

  /** Construct the sequence. */
  public A193579() {
    super(new long[] {-4, 5}, new long[] {9, 15});
  }
}
