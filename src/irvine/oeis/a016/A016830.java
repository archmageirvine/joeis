package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016830 a(n) = (4*n+2)^6.
 * @author Sean A. Irvine
 */
public class A016830 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016830() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {64, 46656, 1000000, 7529536, 34012224, 113379904, 308915776});
  }
}
