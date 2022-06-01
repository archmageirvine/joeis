package irvine.oeis.a284;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A284985 a(0)=0, a(1)=24; for n&gt;=2, a(n)=576*a(n-1)-a(n-2).
 * @author Sean A. Irvine
 */
public class A284985 extends LinearRecurrence {

  /** Construct the sequence. */
  public A284985() {
    super(new long[] {-1, 576}, new long[] {0, 24});
  }
}
