package irvine.oeis.a152;

import irvine.oeis.LinearRecurrence;

/**
 * A152594 <code>a(n)=-5*a(n-1)-2*a(n-2), n&gt;1 ; a(0)=1, a(1)=-1 </code>.
 * @author Sean A. Irvine
 */
public class A152594 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152594() {
    super(new long[] {-2, -5}, new long[] {1, -1});
  }
}
