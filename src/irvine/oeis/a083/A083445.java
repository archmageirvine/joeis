package irvine.oeis.a083;

import irvine.oeis.LinearRecurrence;

/**
 * A083445 Largest n-digit number minus the product of its digits; i.e., a(n) = 99999... (n 9's) - 9^n.
 * @author Sean A. Irvine
 */
public class A083445 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083445() {
    super(new long[] {90, -109, 20}, new long[] {18, 270, 3438});
  }
}
