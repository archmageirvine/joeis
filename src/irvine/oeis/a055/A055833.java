package irvine.oeis.a055;

import irvine.oeis.LinearRecurrence;

/**
 * A055833 <code>T(n,n-6),</code> where T is the array in A055830.
 * @author Sean A. Irvine
 */
public class A055833 extends LinearRecurrence {

  /** Construct the sequence. */
  public A055833() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {13, 58, 162, 361, 701, 1239});
  }
}
