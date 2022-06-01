package irvine.oeis.a097;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A097791 a(n)=5a(n-1)+C(n+4,4),n&gt;0, a(0)=1.
 * @author Sean A. Irvine
 */
public class A097791 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097791() {
    super(new long[] {-5, 26, -55, 60, -35, 10}, new long[] {1, 10, 65, 360, 1870, 9476});
  }
}
