package irvine.oeis.a152;

import irvine.oeis.LinearRecurrence;

/**
 * A152620 <code>a(n)=-8*a(n-1)-6*a(n-2), n&gt;1 </code>; <code>a(0)=1, a(1)=-2 </code>.
 * @author Sean A. Irvine
 */
public class A152620 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152620() {
    super(new long[] {-6, -8}, new long[] {1, -2});
  }
}
