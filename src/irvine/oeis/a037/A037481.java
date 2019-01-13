package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037481.
 * @author Sean A. Irvine
 */
public class A037481 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037481() {
    super(new long[] {-4, 1, 4}, new long[] {0, 1, 6});
  }
}
