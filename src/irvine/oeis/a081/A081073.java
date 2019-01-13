package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081073.
 * @author Sean A. Irvine
 */
public class A081073 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081073() {
    super(new long[] {1, -8, 8}, new long[] {4, 11, 58});
  }
}
