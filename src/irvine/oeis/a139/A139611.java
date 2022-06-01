package irvine.oeis.a139;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A139611 55n + 11.
 * @author Sean A. Irvine
 */
public class A139611 extends LinearRecurrence {

  /** Construct the sequence. */
  public A139611() {
    super(new long[] {-1, 2}, new long[] {11, 66});
  }
}
