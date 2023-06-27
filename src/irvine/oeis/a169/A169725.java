package irvine.oeis.a169;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A169725 a(n) = 3^(n-1)*(6*3^(n-1) + 5) + 1.
 * @author Sean A. Irvine
 */
public class A169725 extends LinearRecurrence {

  /** Construct the sequence. */
  public A169725() {
    super(1, new long[] {27, -39, 13}, new long[] {12, 70, 532});
  }
}
