package irvine.oeis.a101;

import irvine.oeis.LinearRecurrence;

/**
 * A101892 Sum C(n,2k)J(k), k=0..floor(n/2).
 * @author Sean A. Irvine
 */
public class A101892 extends LinearRecurrence {

  /** Construct the sequence. */
  public A101892() {
    super(new long[] {2, 2, -5, 4}, new long[] {0, 0, 1, 3});
  }
}
