package irvine.oeis.a106;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A106006 [n/2] + [n/3] + [n/5].
 * @author Sean A. Irvine
 */
public class A106006 extends LinearRecurrence {

  /** Construct the sequence. */
  public A106006() {
    super(new long[] {-1, -1, 0, 1, 1, 1, 1, 0, -1}, new long[] {0, 0, 1, 2, 3, 4, 6, 6, 7});
  }
}
