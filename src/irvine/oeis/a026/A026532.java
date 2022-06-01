package irvine.oeis.a026;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A026532 Ratios of successive terms are 3, 2, 3, 2, 3, 2, 3, 2, ...
 * @author Sean A. Irvine
 */
public class A026532 extends LinearRecurrence {

  /** Construct the sequence. */
  public A026532() {
    super(new long[] {6, 0}, new long[] {1, 3});
  }
}
