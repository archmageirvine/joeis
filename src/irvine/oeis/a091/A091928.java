package irvine.oeis.a091;

import irvine.oeis.LinearRecurrence;

/**
 * A091928 <code>a(0)=1, a(1)=5</code>; <code>a(n) = 6*a(n-1) + 5*a(n-2)</code> for <code>n&gt;1</code>.
 * @author Sean A. Irvine
 */
public class A091928 extends LinearRecurrence {

  /** Construct the sequence. */
  public A091928() {
    super(new long[] {5, 6}, new long[] {1, 5});
  }
}
