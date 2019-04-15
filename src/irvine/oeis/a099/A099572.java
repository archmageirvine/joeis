package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099572 Sum <code>C(n-k+4,k), k=0..floor(n/2)</code>.
 * @author Sean A. Irvine
 */
public class A099572 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099572() {
    super(new long[] {1, 1, -5, -4, 10, 6, -10, -4, 5, 1}, new long[] {1, 1, 6, 7, 23, 30, 73, 103, 211, 314});
  }
}
