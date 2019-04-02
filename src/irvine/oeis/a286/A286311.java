package irvine.oeis.a286;

import irvine.oeis.LinearRecurrence;

/**
 * A286311 a(n) = 2*a(n-1) - a(n-2) + a(n-4), n&gt;3, a(0)=0, a(1)=a(2)=1, a(3)=3.
 * @author Sean A. Irvine
 */
public class A286311 extends LinearRecurrence {

  /** Construct the sequence. */
  public A286311() {
    super(new long[] {1, 0, -1, 2}, new long[] {0, 1, 1, 3});
  }
}
