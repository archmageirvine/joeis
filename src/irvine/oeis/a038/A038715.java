package irvine.oeis.a038;

import irvine.oeis.LinearRecurrence;

/**
 * A038715 <code>a(n) = floor(n/4)*ceiling((n+2)/4)</code>.
 * @author Sean A. Irvine
 */
public class A038715 extends LinearRecurrence {

  /** Construct the sequence. */
  public A038715() {
    super(new long[] {1, -2, 2, -2, 0, 2, -2, 2}, new long[] {0, 0, 0, 0, 2, 2, 2, 3});
  }
}
