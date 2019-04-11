package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099622 Sum C(n-k,k-1)4^(n-k-1)(5/4)^k, <code>k=0..floor(n/2)</code>.
 * @author Sean A. Irvine
 */
public class A099622 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099622() {
    super(new long[] {-20, -11, 8}, new long[] {0, 1, 8});
  }
}
