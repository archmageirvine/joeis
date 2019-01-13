package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037514.
 * @author Sean A. Irvine
 */
public class A037514 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037514() {
    super(new long[] {-5, 1, 0, 5}, new long[] {2, 10, 51, 257});
  }
}
