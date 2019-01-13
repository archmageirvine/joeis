package irvine.oeis.a265;

import irvine.oeis.LinearRecurrence;

/**
 * A265723.
 * @author Sean A. Irvine
 */
public class A265723 extends LinearRecurrence {

  /** Construct the sequence. */
  public A265723() {
    super(new long[] {-1, 0, 2, 0}, new long[] {0, 3, 4, 3});
  }
}
