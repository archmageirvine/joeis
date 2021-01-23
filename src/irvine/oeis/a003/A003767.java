package irvine.oeis.a003;

import irvine.oeis.LinearRecurrence;

/**
 * A003767 Number of spanning trees in (K_4 - e) X P_n.
 * @author Sean A. Irvine
 */
public class A003767 extends LinearRecurrence {

  /** Construct the sequence. */
  public A003767() {
    super(new long[]{-1, 140, -1715, 4952, -1715, 140},
      new long[]{8, 1152, 147000, 18643968, 2363741512L, 299675376000L}
    );
  }
}
