package irvine.oeis.a226;

import irvine.oeis.LinearRecurrence;

/**
 * A226308 <code>a(n+3) = a(n+2) + a(n+1) + 2*a(n)</code> with <code>a(0)=2, a(1)=1, a(2)=5</code>.
 * @author Sean A. Irvine
 */
public class A226308 extends LinearRecurrence {

  /** Construct the sequence. */
  public A226308() {
    super(new long[] {2, 1, 1}, new long[] {2, 1, 5});
  }
}
