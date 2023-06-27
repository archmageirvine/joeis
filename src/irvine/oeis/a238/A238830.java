package irvine.oeis.a238;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A238830 a(1)=a(2)=0; thereafter a(n) = a(n-2)+A238828(n-1)+A238827(n).
 * @author Sean A. Irvine
 */
public class A238830 extends LinearRecurrence {

  /** Construct the sequence. */
  public A238830() {
    super(1, new long[] {-1, 1, 6, 6, -1, -7, -1, 5, 1}, new long[] {0, 0, 0, 1, 2, 6, 15, 36, 91});
  }
}
