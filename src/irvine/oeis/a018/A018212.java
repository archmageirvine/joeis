package irvine.oeis.a018;

import irvine.oeis.LinearRecurrence;

/**
 * A018212 Alkane (or paraffin) numbers <code>l(11,n)</code>.
 * @author Sean A. Irvine
 */
public class A018212 extends LinearRecurrence {

  /** Construct the sequence. */
  public A018212() {
    super(new long[] {1, -5, 6, 10, -29, 9, 36, -36, -9, 29, -10, -6, 5}, new long[] {1, 5, 25, 85, 255, 651, 1519, 3235, 6470, 12190, 21942, 37854, 63090});
  }
}
