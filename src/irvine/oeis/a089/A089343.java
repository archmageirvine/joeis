package irvine.oeis.a089;

import irvine.oeis.LinearRecurrence;

/**
 * A089343 Sum of all digits in all even numbers from 0 to 6(10^(k+1)-1)/9 (with (k+1) 6's).
 * @author Sean A. Irvine
 */
public class A089343 extends LinearRecurrence {

  /** Construct the sequence. */
  public A089343() {
    super(new long[] {-100, 220, -141, 22}, new long[] {0, 12, 231, 3735});
  }
}
