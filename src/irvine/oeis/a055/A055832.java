package irvine.oeis.a055;

import irvine.oeis.LinearRecurrence;

/**
 * A055832 <code>T(n,n-5),</code> where T is the array in A055830.
 * @author Sean A. Irvine
 */
public class A055832 extends LinearRecurrence {

  /** Construct the sequence. */
  public A055832() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {8, 30, 73, 145, 255});
  }
}
