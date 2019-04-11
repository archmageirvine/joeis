package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024213 <code>a(n) =</code> 3rd elementary symmetric function of first <code>n+2</code> positive integers congruent to <code>1 mod 3</code>.
 * @author Sean A. Irvine
 */
public class A024213 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024213() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {28, 418, 2485, 9605, 28700, 72128, 159978});
  }
}
