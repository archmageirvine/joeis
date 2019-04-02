package irvine.oeis.a003;

import irvine.oeis.LinearRecurrence;

/**
 * A003753 Number of spanning trees in C_4 X P_n.
 * @author Sean A. Irvine
 */
public class A003753 extends LinearRecurrence {

  /** Construct the sequence. */
  public A003753() {
    super(new long[]{-1, 90, -735, 1548, -735, 90},
      new long[] {4, 384, 31500, 2558976, 207746836, 16864848000L}
    );
  }
}
