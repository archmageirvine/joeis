package irvine.oeis.a033;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A033517 Number of matchings in graph C_{5} X P_{n}.
 * @author Sean A. Irvine
 */
public class A033517 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033517() {
    super(new long[] {-1, -3, 40, 119, -159, -209, 76, 25}, new long[] {1, 11, 342, 9213, 253880, 6974078, 191668283, 5267252351L});
  }
}
