package irvine.oeis.a003;

import irvine.oeis.LinearRecurrence;

/**
 * A003698 Number of 2-factors in <code>C_4 X P_n</code>.
 * @author Sean A. Irvine
 */
public class A003698 extends LinearRecurrence {

  /** Construct the sequence. */
  public A003698() {
    super(new long[] {-4, 3, 6}, new long[] {1, 9, 53});
  }
}
