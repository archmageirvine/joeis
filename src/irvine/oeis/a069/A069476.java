package irvine.oeis.a069;

import irvine.oeis.LinearRecurrence;

/**
 * A069476 First differences of A069475, successive differences of <code>(n+1)^6-n^6</code>.
 * @author Sean A. Irvine
 */
public class A069476 extends LinearRecurrence {

  /** Construct the sequence. */
  public A069476() {
    super(new long[] {-1, 2}, new long[] {1800, 2520});
  }
}
