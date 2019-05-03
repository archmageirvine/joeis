package irvine.oeis.a089;

import irvine.oeis.LinearRecurrence;

/**
 * A089350 Sum of all digits in all even numbers from 0 to <code>8(10^(k+1)-1)/9 (with (k+1) 8's)</code>.
 * @author Sean A. Irvine
 */
public class A089350 extends LinearRecurrence {

  /** Construct the sequence. */
  public A089350() {
    super(new long[] {-100, 220, -141, 22}, new long[] {0, 20, 360, 5520});
  }
}
