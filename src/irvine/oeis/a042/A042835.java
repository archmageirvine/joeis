package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042835 Denominators of continued fraction convergents to <code>sqrt(948)</code>.
 * @author Sean A. Irvine
 */
public class A042835 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042835() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 456302, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 4, 5, 19, 385, 1174, 1559, 5851, 7410, 450451, 457861, 1824034, 2281895, 8669719, 175676275, 535698544, 711374819, 2669823001L, 3381197820L});
  }
}
