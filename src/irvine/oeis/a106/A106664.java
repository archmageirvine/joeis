package irvine.oeis.a106;

import irvine.oeis.LinearRecurrence;

/**
 * A106664.
 * @author Sean A. Irvine
 */
public class A106664 extends LinearRecurrence {

  /** Construct the sequence. */
  public A106664() {
    super(new long[] {2, -2, -1, 2}, new long[] {-1, 1, 2, 5});
  }
}
