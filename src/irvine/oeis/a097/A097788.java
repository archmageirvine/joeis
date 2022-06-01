package irvine.oeis.a097;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A097788 a(n)=4a(n-1)+C(n+3,3),n&gt;0, a(0)=1.
 * @author Sean A. Irvine
 */
public class A097788 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097788() {
    super(new long[] {4, -17, 28, -22, 8}, new long[] {1, 8, 42, 188, 787});
  }
}
