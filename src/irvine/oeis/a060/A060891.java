package irvine.oeis.a060;

import irvine.oeis.LinearRecurrence;

/**
 * A060891 <code>a(n) = n^6 - n^3 + 1</code>.
 * @author Sean A. Irvine
 */
public class A060891 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060891() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {1, 1, 57, 703, 4033, 15501, 46441});
  }
}
