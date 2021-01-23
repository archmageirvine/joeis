package irvine.oeis.a178;

import irvine.oeis.LinearRecurrence;

/**
 * A178711 Partial sums of floor(5^n/7).
 * @author Sean A. Irvine
 */
public class A178711 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178711() {
    super(new long[] {5, -11, 7, 4, -11, 7}, new long[] {0, 3, 20, 109, 555, 2787});
  }
}
