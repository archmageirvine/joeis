package irvine.oeis.a286;

import irvine.oeis.LinearRecurrence;

/**
 * A286390 <code>a(n) = a(n-2) - 2*a(n-3) + a(n-4)</code> for <code>n&gt;3, a(0)=0, a(1)=2, a(2)=-1, a(3)=3</code>.
 * @author Sean A. Irvine
 */
public class A286390 extends LinearRecurrence {

  /** Construct the sequence. */
  public A286390() {
    super(new long[] {1, -2, 1, 0}, new long[] {0, 2, -1, 3});
  }
}
