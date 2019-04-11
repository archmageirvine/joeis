package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024120 <code>a(n) = 10^n - n^6</code>.
 * @author Sean A. Irvine
 */
public class A024120 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024120() {
    super(new long[] {-10, 71, -217, 371, -385, 245, -91, 17}, new long[] {1, 9, 36, 271, 5904, 84375, 953344, 9882351});
  }
}
