package irvine.oeis.a003;

import irvine.oeis.LinearRecurrence;

/**
 * A003756 Number of spanning trees with degrees 1 and 3 in <code>S_4 X P_{2n-1}</code>.
 * @author Sean A. Irvine
 */
public class A003756 extends LinearRecurrence {

  /** Construct the sequence. */
  public A003756() {
    super(new long[]{0, 0, 4, 16, 2}, new long[]{1, 0, 24, 54, 492});
  }
}
