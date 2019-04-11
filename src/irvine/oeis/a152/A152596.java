package irvine.oeis.a152;

import irvine.oeis.LinearRecurrence;

/**
 * A152596 <code>a(n) = 7*a(n-1) - 6*a(n-2), n&gt;1</code>; <code>a(0)=1, a(1)=3</code>.
 * @author Sean A. Irvine
 */
public class A152596 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152596() {
    super(new long[] {-6, 7}, new long[] {1, 3});
  }
}
