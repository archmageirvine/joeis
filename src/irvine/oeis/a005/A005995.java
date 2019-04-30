package irvine.oeis.a005;

import irvine.oeis.LinearRecurrence;

/**
 * A005995 Alkane (or paraffin) numbers <code>l(8,n)</code>.
 * @author Sean A. Irvine
 */
public class A005995 extends LinearRecurrence {

  /** Construct the sequence. */
  public A005995() {
    super(new long[] {-1, 3, 0, -8, 6, 6, -8, 0, 3}, new long[] {1, 3, 12, 28, 66, 126, 236, 396, 651});
  }
}

