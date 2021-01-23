package irvine.oeis.a134;

import irvine.oeis.LinearRecurrence;

/**
 * A134325 a(n) = a(n) = +13*a(n-2) +7*a(n-3) -47*a(n-4) -38*a(n-5) +48*a(n-6) +43*a(n-7) -7*a(n-8) -1*a(n-9).
 * @author Sean A. Irvine
 */
public class A134325 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134325() {
    super(new long[] {-1, -7, 43, 48, -38, -47, 7, 13, 0}, new long[] {3, 9, 29, 87, 281, 857, 2741, 8471, 26876});
  }
}
