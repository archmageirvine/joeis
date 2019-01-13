package irvine.oeis.a064;

import irvine.oeis.LinearRecurrence;

/**
 * A064385.
 * @author Sean A. Irvine
 */
public class A064385 extends LinearRecurrence {

  /** Construct the sequence. */
  public A064385() {
    super(new long[] {-5, 6}, new long[] {7, 47});
  }
}
