package irvine.oeis.a187;

import irvine.oeis.LinearRecurrence;

/**
 * A187620 <code>a(n) = n^6 - a(n-1), a(0)=1</code>.
 * @author Sean A. Irvine
 */
public class A187620 extends LinearRecurrence {

  /** Construct the sequence. */
  public A187620() {
    super(new long[] {1, -6, 14, -14, 0, 14, -14, 6}, new long[] {1, 0, 64, 665, 3431, 12194, 34462, 83187});
  }
}
