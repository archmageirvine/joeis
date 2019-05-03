package irvine.oeis.a003;

import irvine.oeis.LinearRecurrence;

/**
 * A003691 Number of spanning trees with degrees 1 and 3 in <code>K_3 X P_2n</code>.
 * @author Sean A. Irvine
 */
public class A003691 extends LinearRecurrence {

  /** Construct the sequence. */
  public A003691() {
    super(new long[] {0, 8, 8}, new long[] {3, 36, 324});
  }
}
