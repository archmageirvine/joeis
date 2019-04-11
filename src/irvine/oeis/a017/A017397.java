package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017397 <code>a(n) = (11*n)^9</code>.
 * @author Sean A. Irvine
 */
public class A017397 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017397() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {0, 2357947691L, 1207269217792L, 46411484401953L, 618121839509504L, 4605366583984375L, 23762680013799936L, 95151694449171437L, 316478381828866048L, 913517247483640899L});
  }
}
