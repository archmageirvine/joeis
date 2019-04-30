package irvine.oeis.a152;

import irvine.oeis.LinearRecurrence;

/**
 * A152167 <code>a(n)=-a(n-1)+3*a(n-2), n&gt;1 ; a(0)=1, a(1)=-3 </code>.
 * @author Sean A. Irvine
 */
public class A152167 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152167() {
    super(new long[] {3, -1}, new long[] {1, -3});
  }
}
