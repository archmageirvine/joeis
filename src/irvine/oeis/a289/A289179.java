package irvine.oeis.a289;

import irvine.oeis.LinearRecurrence;

/**
 * A289179 Edge count of the <code>n X n</code> white bishop graph.
 * @author Sean A. Irvine
 */
public class A289179 extends LinearRecurrence {

  /** Construct the sequence. */
  public A289179() {
    super(new long[] {-1, 2, 1, -4, 1, 2}, new long[] {0, 1, 4, 14, 28, 55});
  }
}
