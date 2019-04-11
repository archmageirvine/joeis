package irvine.oeis.a140;

import irvine.oeis.LinearRecurrence;

/**
 * A140165 <code>a(n) = -a(n-1) + 3*a(n-2),</code> starting <code>a(1)=1, a(2)=2</code>.
 * @author Sean A. Irvine
 */
public class A140165 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140165() {
    super(new long[] {3, -1}, new long[] {1, 2});
  }
}
