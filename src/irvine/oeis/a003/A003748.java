package irvine.oeis.a003;

import irvine.oeis.LinearRecurrence;

/**
 * A003748 Number of 2-factors in K_5 X P_n.
 * @author Sean A. Irvine
 */
public class A003748 extends LinearRecurrence {

  /** Construct the sequence. */
  public A003748() {
    super(new long[]{-436, 288, 47}, new long[] {12, 814, 41278});
  }
}
