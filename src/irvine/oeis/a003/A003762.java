package irvine.oeis.a003;

import irvine.oeis.LinearRecurrence;

/**
 * A003762 Number of spanning trees with degrees 1 and 3 in D_4 X P_n.
 * @author Sean A. Irvine
 */
public class A003762 extends LinearRecurrence {

  /** Construct the sequence. */
  public A003762() {
    super(new long[]{0, 0, 0, -4, 8, 4, -36, -14, -76, 48, 36, 13, 30, -5, 4},
      new long[]{1, 4, 16, 92, 432, 1884, 8582, 39736, 181936, 829672, 3793850, 17366388, 79441576, 363298928, 1661695126}
    );
  }
}
