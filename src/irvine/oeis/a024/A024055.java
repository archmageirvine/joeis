package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024055 <code>a(n) = 5^n - n^6</code>.
 * @author Sean A. Irvine
 */
public class A024055 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024055() {
    super(new long[] {-5, 36, -112, 196, -210, 140, -56, 12}, new long[] {1, 4, -39, -604, -3471, -12500, -31031, -39524});
  }
}
