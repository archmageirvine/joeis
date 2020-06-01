package irvine.oeis.a238;

import irvine.oeis.LinearRecurrence;

/**
 * A238832 <code>a(1)=0;</code> thereafter <code>a(n) = A238824(n-1)+A238830(n-1)</code>.
 * @author Sean A. Irvine
 */
public class A238832 extends LinearRecurrence {

  /** Construct the sequence. */
  public A238832() {
    super(new long[] {-1, 1, 6, 6, -1, -7, -1, 5, 1}, new long[] {0, 0, 1, 1, 4, 9, 23, 58, 141});
  }
}
