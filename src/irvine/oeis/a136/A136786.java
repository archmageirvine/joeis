package irvine.oeis.a136;

import irvine.oeis.LinearRecurrence;

/**
 * A136786.
 * @author Sean A. Irvine
 */
public class A136786 extends LinearRecurrence {

  /** Construct the sequence. */
  public A136786() {
    super(new long[] {3, 13, -22, 9}, new long[] {1, 4, 21, 111});
  }
}
