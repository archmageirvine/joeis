package irvine.oeis.a105;

import irvine.oeis.LinearRecurrence;

/**
 * A105947 a(n) = C(n+6,n)*C(n+4,4).
 * @author Sean A. Irvine
 */
public class A105947 extends LinearRecurrence {

  /** Construct the sequence. */
  public A105947() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11}, new long[] {1, 35, 420, 2940, 14700, 58212, 194040, 566280, 1486485, 3578575, 8016008});
  }
}
