package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024083 <code>a(n) = 7^n - n^8</code>.
 * @author Sean A. Irvine
 */
public class A024083 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024083() {
    super(new long[] {-7, 64, -261, 624, -966, 1008, -714, 336, -99, 16}, new long[] {1, 6, -207, -6218, -63135, -373818, -1561967, -4941258, -11012415, -2693114});
  }
}
