package irvine.oeis.a060;

import irvine.oeis.LinearRecurrence;

/**
 * A060887 n^12 + n^11 + n^10 + n^9 + n^8 + n^7 + n^6 + n^5 + n^4 + n^3 + n^2 + n + 1.
 * @author Sean A. Irvine
 */
public class A060887 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060887() {
    super(new long[] {1, -13, 78, -286, 715, -1287, 1716, -1716, 1287, -715, 286, -78, 13}, new long[] {1, 13, 8191, 797161, 22369621, 305175781, 2612138803L, 16148168401L, 78536544841L, 317733228541L, 1111111111111L, 3452271214393L, 9726655034461L});
  }
}
