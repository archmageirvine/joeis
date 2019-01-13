package irvine.oeis.a247;

import irvine.oeis.LinearRecurrence;

/**
 * A247851.
 * @author Sean A. Irvine
 */
public class A247851 extends LinearRecurrence {

  /** Construct the sequence. */
  public A247851() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {-120, 184, -824, 14136, 150664, 717880, 2389704});
  }
}
