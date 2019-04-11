package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041711 Denominators of continued fraction convergents to <code>sqrt(375)</code>.
 * @author Sean A. Irvine
 */
public class A041711 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041711() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 30248, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 2, 3, 8, 11, 63, 74, 211, 285, 781, 29963, 60707, 90670, 242047, 332717, 1905632, 2238349, 6382330, 8620679, 23623688});
  }
}
