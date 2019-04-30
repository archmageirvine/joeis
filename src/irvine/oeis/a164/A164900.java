package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164900 <code>a(2n) = 4*n*(n+1) + 3; a(2n+1) = 2*n*(n+2) + 3</code>.
 * @author Sean A. Irvine
 */
public class A164900 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164900() {
    super(new long[] {1, 0, -3, 0, 3, 0}, new long[] {3, 3, 11, 9, 27, 19});
  }
}
