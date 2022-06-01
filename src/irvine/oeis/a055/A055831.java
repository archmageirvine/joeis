package irvine.oeis.a055;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A055831 T(n,n-4), where T is the array in A055830.
 * @author Sean A. Irvine
 */
public class A055831 extends LinearRecurrence {

  /** Construct the sequence. */
  public A055831() {
    super(new long[] {-1, 4, -6, 4}, new long[] {5, 15, 31, 54});
  }
}
