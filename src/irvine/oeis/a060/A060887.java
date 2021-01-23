package irvine.oeis.a060;

import irvine.oeis.LinearRecurrence;

/**
 * A060887 a(n) = Sum_{j=0..12} n^j.
 * @author Sean A. Irvine
 */
public class A060887 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060887() {
    super(new long[] {1, -13, 78, -286, 715, -1287, 1716, -1716, 1287, -715, 286, -78, 13}, new long[] {1, 13, 8191, 797161, 22369621, 305175781, 2612138803L, 16148168401L, 78536544841L, 317733228541L, 1111111111111L, 3452271214393L, 9726655034461L});
  }
}
