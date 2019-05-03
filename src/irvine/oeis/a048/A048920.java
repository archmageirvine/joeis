package irvine.oeis.a048;

import irvine.oeis.LinearRecurrence;

/**
 * A048920 Indices of heptagonal numbers <code>(A000566)</code> which are also <code>9-gonal</code>.
 * @author Sean A. Irvine
 */
public class A048920 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048920() {
    super(new long[] {1, -143, 143}, new long[] {1, 104, 14725});
  }
}
