package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037724.
 * @author Sean A. Irvine
 */
public class A037724 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037724() {
    super(new long[] {-5, 1, 0, 0, 5}, new long[] {2, 10, 53, 266, 1332});
  }
}
