package irvine.oeis.a230;

import irvine.oeis.LinearRecurrence;

/**
 * A230539 <code>a(n) = 3*n*2^(3*n-1)</code>.
 * @author Sean A. Irvine
 */
public class A230539 extends LinearRecurrence {

  /** Construct the sequence. */
  public A230539() {
    super(new long[] {-64, 16}, new long[] {0, 12});
  }
}
