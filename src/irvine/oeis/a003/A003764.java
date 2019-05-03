package irvine.oeis.a003;

import irvine.oeis.LinearRecurrence;

/**
 * A003764 Number of 2-factors in <code>W_4 X P_n</code>.
 * @author Sean A. Irvine
 */
public class A003764 extends LinearRecurrence {

  /** Construct the sequence. */
  public A003764() {
    super(new long[]{16, -16, -29, 16, 6},
      new long[]{1, 13, 85, 673, 5021}
    );
  }
}
