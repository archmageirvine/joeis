package irvine.oeis.a121;

import irvine.oeis.LinearRecurrence;

/**
 * A121798 <code>a(n)= 4*a(n-1) +13*a(n-2) -44*a(n-3) -57*a(n-4) +120*a(n-5) +63*a(n-6) -56*a(n-7) +6*a(n-8)</code>.
 * @author Sean A. Irvine
 */
public class A121798 extends LinearRecurrence {

  /** Construct the sequence. */
  public A121798() {
    super(new long[] {6, -56, 63, 120, -57, -44, 13, 4}, new long[] {0, 28, 408, 1502, 7821, 31911, 145162, 616196});
  }
}
