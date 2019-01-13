package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037626.
 * @author Sean A. Irvine
 */
public class A037626 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037626() {
    super(new long[] {-5, 1, 0, 5}, new long[] {2, 13, 65, 327});
  }
}
