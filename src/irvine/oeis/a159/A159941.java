package irvine.oeis.a159;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A159941 Number of trisubstituted linear alkanes of composition C_n H_(2n-1) XYZ.
 * @author Sean A. Irvine
 */
public class A159941 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159941() {
    super(2, new long[] {-1, 4, -6, 4}, new long[] {8, 32, 92, 212});
  }
}
