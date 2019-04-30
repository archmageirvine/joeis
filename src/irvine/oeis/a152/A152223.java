package irvine.oeis.a152;

import irvine.oeis.LinearRecurrence;

/**
 * A152223 <code>a(n) = -4*a(n-1) + 6*a(n-2), n&gt;1; a(0)=1, a(1)=-6</code>.
 * @author Sean A. Irvine
 */
public class A152223 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152223() {
    super(new long[] {6, -4}, new long[] {1, -6});
  }
}
