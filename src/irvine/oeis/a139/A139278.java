package irvine.oeis.a139;

import irvine.oeis.LinearRecurrence;

/**
 * A139278 <code>a(n) = n*(8*n+7)</code>.
 * @author Sean A. Irvine
 */
public class A139278 extends LinearRecurrence {

  /** Construct the sequence. */
  public A139278() {
    super(new long[] {1, -3, 3}, new long[] {0, 15, 46});
  }
}
