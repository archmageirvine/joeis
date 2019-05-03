package irvine.oeis.a130;

import irvine.oeis.LinearRecurrence;

/**
 * A130615 Sum of the first <code>10^n 4th</code> powers.
 * @author Sean A. Irvine
 */
public class A130615 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130615() {
    super(new long[] {-10000000000000L, 1011100000000L, -1111110000, 111010}, new long[] {1, 25333, 2050333330, 200500333333300L});
  }
}
