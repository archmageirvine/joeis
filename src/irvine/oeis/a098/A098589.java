package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098589 <code>a(n) = 3*a(n-1) + 2*a(n-3),</code> with <code>a(0)=1, a(1)=3</code>.
 * @author Sean A. Irvine
 */
public class A098589 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098589() {
    super(new long[] {2, 0, 3}, new long[] {1, 3, 9});
  }
}
