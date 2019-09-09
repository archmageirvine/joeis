package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099783 <code>a(n) = Sum_{k=0..floor(n/3)} C(n-k,2*k)*3^(n-2*k)</code>.
 * @author Sean A. Irvine
 */
public class A099783 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099783() {
    super(new long[] {3, -9, 6}, new long[] {1, 3, 9});
  }
}
