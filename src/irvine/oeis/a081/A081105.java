package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081105.
 * @author Sean A. Irvine
 */
public class A081105 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081105() {
    super(new long[] {-25, 10}, new long[] {1, 6});
  }
}
