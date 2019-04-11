package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041558 Numerators of continued fraction convergents to <code>sqrt(297)</code>.
 * @author Sean A. Irvine
 */
public class A041558 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041558() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 97198, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {17, 69, 224, 293, 517, 1327, 1844, 3171, 11357, 48599, 1663723, 6703491, 21774196, 28477687, 50251883, 128981453, 179233336, 308214789, 1103877703, 4723725601L});
  }
}
