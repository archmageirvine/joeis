package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081893.
 * @author Sean A. Irvine
 */
public class A081893 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081893() {
    super(new long[] {64, -48, 12}, new long[] {1, 6, 33});
  }
}
