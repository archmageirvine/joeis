package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041729 Denominators of continued fraction convergents to <code>sqrt(384)</code>.
 * @author Sean A. Irvine
 */
public class A041729 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041729() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 9602, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 2, 5, 47, 99, 146, 245, 9456, 9701, 19157, 48015, 451292, 950599, 1401891, 2352490});
  }
}
