package irvine.oeis.a155;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A155627 a(n) = 6^n - 4^n + 1.
 * @author Sean A. Irvine
 */
public class A155627 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155627() {
    super(new long[] {24, -34, 11}, new long[] {1, 3, 21});
  }
}
