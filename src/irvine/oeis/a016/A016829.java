package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016829 (4n+2)^5.
 * @author Sean A. Irvine
 */
public class A016829 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016829() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {32, 7776, 100000, 537824, 1889568, 5153632});
  }
}
