package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022308 <code>a(n) = a(n-1) + a(n-2) + 1</code> for <code>n&gt;1, a(0)=0, a(1)=3</code>.
 * @author Sean A. Irvine
 */
public class A022308 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022308() {
    super(new long[] {-1, 0, 2}, new long[] {0, 3, 4});
  }
}
