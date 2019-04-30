package irvine.oeis.a267;

import irvine.oeis.LinearRecurrence;

/**
 * A267063 Coefficient of <code>x^4</code> in the minimal polynomial of the continued fraction <code>[1^n,sqrt(2)+sqrt(3),1,1,...]</code>, where <code>1^n</code> means n ones.
 * @author Sean A. Irvine
 */
public class A267063 extends LinearRecurrence {

  /** Construct the sequence. */
  public A267063() {
    super(new long[] {1, -34, -714, 4641, 12376, -12376, -4641, 714, 34}, new long[] {47, 7547, 96847, 8834047, 335645147, 17176306847L, 781541264047L, 37170460359547L, 1738056704580047L});
  }
}
