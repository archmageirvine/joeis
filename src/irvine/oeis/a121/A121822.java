package irvine.oeis.a121;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A121822 Number of closed walks of length 2*n on the 5-cube.
 * @author Sean A. Irvine
 */
public class A121822 extends LinearRecurrence {

  /** Construct the sequence. */
  public A121822() {
    super(new long[] {225, -259, 35}, new long[] {1, 5, 65});
  }
}
