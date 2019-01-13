package irvine.oeis.a134;

import irvine.oeis.LinearRecurrence;

/**
 * A134288.
 * @author Sean A. Irvine
 */
public class A134288 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134288() {
    super(new long[] {1, -13, 78, -286, 715, -1287, 1716, -1716, 1287, -715, 286, -78, 13}, new long[] {1, 28, 336, 2520, 13860, 60984, 226512, 736164, 2147145, 5725720, 14158144, 32821152, 71954064});
  }
}
