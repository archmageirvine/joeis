package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041323 Denominators of continued fraction convergents to <code>sqrt(175)</code>.
 * @author Sean A. Irvine
 */
public class A041323 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041323() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 4048, 0, 0, 0, 0, 0}, new long[] {1, 4, 9, 13, 35, 153, 4013, 16205, 36423, 52628, 141679, 619344});
  }
}
