package irvine.oeis.a003;

import irvine.oeis.LinearRecurrence;

/**
 * A003755 Number of spanning trees in S_4 X P_n.
 * @author Sean A. Irvine
 */
public class A003755 extends LinearRecurrence {

  /** Construct the sequence. */
  public A003755() {
    super(new long[]{-1, 48, -336, 582, -336, 48},
      new long[] {1, 54, 2240, 89964, 3596725, 143700480}
    );
  }
}
