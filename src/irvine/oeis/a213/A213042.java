package irvine.oeis.a213;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A213042 Convolution of (1,0,2,0,3,0,...) and (1,0,0,2,0,0,3,0,0,...); i.e., (A027656(n)) and (A175676(n+2)).
 * @author Sean A. Irvine
 */
public class A213042 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213042() {
    super(new long[] {-1, 0, 2, 2, -1, -4, -1, 2, 2, 0}, new long[] {1, 0, 2, 2, 3, 4, 7, 6, 11, 12});
  }
}
