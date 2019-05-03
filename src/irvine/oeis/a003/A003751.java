package irvine.oeis.a003;

import irvine.oeis.LinearRecurrence;

/**
 * A003751 Number of spanning trees in <code>K_5 x P_n</code>.
 * @author Sean A. Irvine
 */
public class A003751 extends LinearRecurrence {

  /** Construct the sequence. */
  public A003751() {
    super(new long[]{1, -2255, 105985, -105985, 2255},
      new long[] {125, 300125, 663552000, 1464514260125L, 3232184906328125L}
    );
  }
}
