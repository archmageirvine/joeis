package irvine.oeis.a243;

import irvine.oeis.LinearRecurrence;

/**
 * A243130 <code>1024*n^10 - 2304*n^8 + 1792*n^6 - 560*n^4 + 60*n^2 - 1</code>.
 * @author Sean A. Irvine
 */
public class A243130 extends LinearRecurrence {

  /** Construct the sequence. */
  public A243130() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11}, new long[] {-1, 11, 564719, 46611179, 929944511, 9127651499L, 58130412911L, 276182038859L, 1061324394239L, 3472236254411L, 10011386405999L});
  }
}
