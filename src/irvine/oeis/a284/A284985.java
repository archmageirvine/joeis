package irvine.oeis.a284;

import irvine.oeis.LinearRecurrence;

/**
 * A284985 <code>a(0)=0, a(1)=24;</code> for <code>n&gt;=2, a(n)=576*a(n-1)-a(n-2)</code>.
 * @author Sean A. Irvine
 */
public class A284985 extends LinearRecurrence {

  /** Construct the sequence. */
  public A284985() {
    super(new long[] {-1, 576}, new long[] {0, 24});
  }
}
