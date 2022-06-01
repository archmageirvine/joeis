package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016974 a(n) = (6*n + 5)^6.
 * @author Sean A. Irvine
 */
public class A016974 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016974() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {15625, 1771561, 24137569, 148035889, 594823321, 1838265625, 4750104241L});
  }
}
