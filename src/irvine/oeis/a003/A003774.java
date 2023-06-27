package irvine.oeis.a003;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A003774 Number of spanning trees with degrees 1 and 3 in K_4 X P_n.
 * @author Sean A. Irvine
 */
public class A003774 extends LinearRecurrence {

  /** Construct the sequence. */
  public A003774() {
    super(1, new long[]{0, 0, 0, 0, 48, 4, 12},
      new long[]{4, 48, 672, 8496, 106944, 1349760, 17032800}
    );
  }
}
