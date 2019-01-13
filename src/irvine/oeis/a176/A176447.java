package irvine.oeis.a176;

import irvine.oeis.LinearRecurrence;

/**
 * A176447.
 * @author Sean A. Irvine
 */
public class A176447 extends LinearRecurrence {

  /** Construct the sequence. */
  public A176447() {
    super(new long[] {-1, 0, 2, 0}, new long[] {0, 1, -1, 3});
  }
}
