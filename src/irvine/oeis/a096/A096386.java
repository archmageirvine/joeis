package irvine.oeis.a096;

import irvine.oeis.LinearRecurrence;

/**
 * A096386 Expansion of <code>x^2(x^4+x^2+x+1)/(x^7-x^6-x+1)</code>.
 * @author Sean A. Irvine
 */
public class A096386 extends LinearRecurrence {

  /** Construct the sequence. */
  public A096386() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 1}, new long[] {0, 0, 1, 2, 3, 3, 4});
  }
}
