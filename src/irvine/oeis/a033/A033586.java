package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033586 a(n) = 4*n*(2*n + 1).
 * @author Sean A. Irvine
 */
public class A033586 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033586() {
    super(new long[] {1, -3, 3}, new long[] {0, 12, 40});
  }
}
