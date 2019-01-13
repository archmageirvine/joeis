package irvine.oeis.a060;

import irvine.oeis.LinearRecurrence;

/**
 * A060790.
 * @author Sean A. Irvine
 */
public class A060790 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060790() {
    super(new long[] {-1, 2, 2, 2}, new long[] {-1, 2, 2, 3});
  }
}
