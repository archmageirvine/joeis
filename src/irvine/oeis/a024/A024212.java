package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024212 2nd elementary symmetric function of first <code>n+1</code> positive integers congruent to <code>1 mod 3</code>.
 * @author Sean A. Irvine
 */
public class A024212 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024212() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {4, 39, 159, 445, 1005});
  }
}
