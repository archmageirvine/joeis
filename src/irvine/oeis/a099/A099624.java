package irvine.oeis.a099;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A099624 a(n) = Sum_{k=0..floor(n/2)} C(n-k,k+2)*3^(n-k-2)*(4/3)^k.
 * @author Sean A. Irvine
 */
public class A099624 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099624() {
    super(new long[] {36, 3, -23, 9}, new long[] {0, 0, 1, 9});
  }
}
