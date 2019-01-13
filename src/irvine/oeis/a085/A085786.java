package irvine.oeis.a085;

import irvine.oeis.LinearRecurrence;

/**
 * A085786.
 * @author Sean A. Irvine
 */
public class A085786 extends LinearRecurrence {

  /** Construct the sequence. */
  public A085786() {
    super(new long[] {-1, 4, -6, 4}, new long[] {2, 11, 33, 74});
  }
}
