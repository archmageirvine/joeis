package irvine.oeis.a095;

import irvine.oeis.LinearRecurrence;

/**
 * A095695 <code>T(n,4)</code> diagonal of triangle in A095693.
 * @author Sean A. Irvine
 */
public class A095695 extends LinearRecurrence {

  /** Construct the sequence. */
  public A095695() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {6, 130, 1005, 4830, 17465, 52101, 135135, 314985, 674685});
  }
}
