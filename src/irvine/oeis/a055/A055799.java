package irvine.oeis.a055;

import irvine.oeis.LinearRecurrence;

/**
 * A055799 <code>T(2n+6,n),</code> array T as in A055794.
 * @author Sean A. Irvine
 */
public class A055799 extends LinearRecurrence {

  /** Construct the sequence. */
  public A055799() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {1, 8, 37, 130, 385, 1012, 2431, 5434, 11440, 22880});
  }
}
