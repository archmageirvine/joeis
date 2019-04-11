package irvine.oeis.a276;

import irvine.oeis.LinearRecurrence;

/**
 * A276225 <code>a(n+3) = 2*a(n+2) + a(n+1) + a(n)</code> with <code>a(0)=3, a(1)=2, a(2)=6</code>.
 * @author Sean A. Irvine
 */
public class A276225 extends LinearRecurrence {

  /** Construct the sequence. */
  public A276225() {
    super(new long[] {1, 1, 2}, new long[] {3, 2, 6});
  }
}
