package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041195 Denominators of continued fraction convergents to <code>sqrt(108)</code>.
 * @author Sean A. Irvine
 */
public class A041195 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041195() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 2702, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 2, 3, 5, 23, 28, 51, 130, 2651, 5432, 8083, 13515, 62143, 75658, 137801, 351260});
  }
}
