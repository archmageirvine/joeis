package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042805 Denominators of continued fraction convergents to sqrt(933).
 * @author Sean A. Irvine
 */
public class A042805 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042805() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 150526, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 2, 11, 222, 1121, 1343, 2464, 149183, 151647, 300830, 1655797, 33416770, 168739647, 202156417, 370896064});
  }
}
