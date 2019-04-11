package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027660 <code>a(n) =</code> C(n+2,2) + C(n+2,3) + C(n+2,4) + C(n+2,5).
 * @author Sean A. Irvine
 */
public class A027660 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027660() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {1, 4, 11, 26, 56, 112});
  }
}
