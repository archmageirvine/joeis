package irvine.oeis.a080;

import irvine.oeis.LinearRecurrence;

/**
 * A080926 Partial sums of <code>A080925</code>.
 * @author Sean A. Irvine
 */
public class A080926 extends LinearRecurrence {

  /** Construct the sequence. */
  public A080926() {
    super(new long[] {-3, 1, 3}, new long[] {0, 1, 6});
  }
}
