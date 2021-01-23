package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099787 a(n) = Sum_{k=0..floor(n/4)} C(n-k,3*k) * 2^k * 3^(n-4*k).
 * @author Sean A. Irvine
 */
public class A099787 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099787() {
    super(new long[] {2, 27, -27, 9}, new long[] {1, 3, 9, 27});
  }
}
