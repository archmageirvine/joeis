package irvine.oeis.a293;

import irvine.oeis.LinearRecurrence;

/**
 * A293611 <code>a(n) = (25*n +</code> 41)*Pochhammer(n, <code>5) / 6!</code>.
 * @author Sean A. Irvine
 */
public class A293611 extends LinearRecurrence {

  /** Construct the sequence. */
  public A293611() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 11, 91, 406, 1316, 3486, 8022});
  }
}
