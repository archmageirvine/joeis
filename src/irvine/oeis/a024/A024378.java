package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024378 <code>a(n) = 2nd</code> elementary symmetric function of the first <code>n+1</code> positive integers congruent to <code>1 mod 4</code>.
 * @author Sean A. Irvine
 */
public class A024378 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024378() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {5, 59, 254, 730, 1675});
  }
}
