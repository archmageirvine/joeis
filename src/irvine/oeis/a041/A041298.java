package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041298 Numerators of continued fraction convergents to sqrt(162).
 * @author Sean A. Irvine
 */
public class A041298 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041298() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 39202, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {12, 13, 38, 51, 140, 1731, 3602, 5333, 14268, 19601, 484692, 504293, 1493278, 1997571, 5488420, 67858611, 141205642, 209064253, 559334148, 768398401});
  }
}
