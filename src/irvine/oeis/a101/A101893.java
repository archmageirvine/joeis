package irvine.oeis.a101;

import irvine.oeis.LinearRecurrence;

/**
 * A101893 a(n) = sum_{k=0..floor(n/2)} C(n,2k)*Pell(k).
 * @author Sean A. Irvine
 */
public class A101893 extends LinearRecurrence {

  /** Construct the sequence. */
  public A101893() {
    super(new long[] {2, 0, -4, 4}, new long[] {0, 0, 1, 3});
  }
}
