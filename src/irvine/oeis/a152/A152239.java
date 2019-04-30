package irvine.oeis.a152;

import irvine.oeis.LinearRecurrence;

/**
 * A152239 <code>a(n)=-5*a(n-1)+7*a(n-2), n&gt;1 ; a(0)=1, a(1)=-7 </code>.
 * @author Sean A. Irvine
 */
public class A152239 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152239() {
    super(new long[] {7, -5}, new long[] {1, -7});
  }
}
