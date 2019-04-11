package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024018 <code>2^n-n^8</code>.
 * @author Sean A. Irvine
 */
public class A024018 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024018() {
    super(new long[] {-2, 19, -81, 204, -336, 378, -294, 156, -54, 11}, new long[] {1, 1, -252, -6553, -65520, -390593, -1679552, -5764673, -16776960, -43046209});
  }
}
