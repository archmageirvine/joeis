package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291254 p-INVERT of <code>(0,1,0,1,0,1, ...)</code>, where p(S) <code>= (1 - 2</code> S - S^2)^2.
 * @author Sean A. Irvine
 */
public class A291254 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291254() {
    super(new long[] {-1, -4, 2, 16, -3, -16, 2, 4}, new long[] {4, 14, 48, 159, 512, 1618, 5036, 15491});
  }
}
