package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042150.
 * @author Sean A. Irvine
 */
public class A042150 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042150() {
    super(new long[] {-1, 0, 98, 0}, new long[] {24, 49, 2376, 4801});
  }
}
