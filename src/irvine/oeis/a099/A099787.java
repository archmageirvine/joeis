package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099787 Sum <code>C(n-k,3k)2^k*3^(n-4k), k=0..floor(n/4)</code>.
 * @author Sean A. Irvine
 */
public class A099787 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099787() {
    super(new long[] {2, 27, -27, 9}, new long[] {1, 3, 9, 27});
  }
}
