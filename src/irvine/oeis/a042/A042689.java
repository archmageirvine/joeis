package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042689 Denominators of continued fraction convergents to <code>sqrt(874)</code>.
 * @author Sean A. Irvine
 */
public class A042689 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042689() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 7450, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 2, 7, 16, 55, 71, 126, 7379, 7505, 14884, 52157, 119198, 409751, 528949, 938700});
  }
}
