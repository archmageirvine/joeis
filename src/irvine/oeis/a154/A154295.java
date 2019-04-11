package irvine.oeis.a154;

import irvine.oeis.LinearRecurrence;

/**
 * A154295 <code>a(n) = 81*n^2 - 90*n + 26</code>.
 * @author Sean A. Irvine
 */
public class A154295 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154295() {
    super(new long[] {1, -3, 3}, new long[] {26, 17, 170});
  }
}
