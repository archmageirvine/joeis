package irvine.oeis.a135;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A135914 a(n) = 4*3^n - 2*2^n - 1.
 * @author Sean A. Irvine
 */
public class A135914 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135914() {
    super(new long[] {6, -11, 6}, new long[] {1, 7, 27});
  }
}
