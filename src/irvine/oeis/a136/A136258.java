package irvine.oeis.a136;

import irvine.oeis.LinearRecurrence;

/**
 * A136258 <code>a(n) = 2*a(n-1) - 2*a(n-2)</code>, with <code>a(0)=1, a(1)=5</code>.
 * @author Sean A. Irvine
 */
public class A136258 extends LinearRecurrence {

  /** Construct the sequence. */
  public A136258() {
    super(new long[] {-2, 2}, new long[] {1, 5});
  }
}
