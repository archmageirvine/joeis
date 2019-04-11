package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024146 <code>a(n) = 12^n - n^6</code>.
 * @author Sean A. Irvine
 */
public class A024146 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024146() {
    super(new long[] {-12, 85, -259, 441, -455, 287, -105, 19}, new long[] {1, 11, 80, 999, 16640, 233207, 2939328, 35714159});
  }
}
