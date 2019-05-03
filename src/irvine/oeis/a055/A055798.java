package irvine.oeis.a055;

import irvine.oeis.LinearRecurrence;

/**
 * A055798 <code>T(2n+5,n)</code>, array T as in <code>A055794</code>.
 * @author Sean A. Irvine
 */
public class A055798 extends LinearRecurrence {

  /** Construct the sequence. */
  public A055798() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {1, 7, 29, 93, 255, 627, 1419, 3003, 6006});
  }
}
