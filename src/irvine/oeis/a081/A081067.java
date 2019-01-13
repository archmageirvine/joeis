package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081067.
 * @author Sean A. Irvine
 */
public class A081067 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081067() {
    super(new long[] {1, -8, 8}, new long[] {5, 20, 125});
  }
}
