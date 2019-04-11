package irvine.oeis.a276;

import irvine.oeis.LinearRecurrence;

/**
 * A276226 <code>a(n+3) = 2*a(n+2) + a(n+1) + a(n)</code> with <code>a(0)=0, a(1)=6, a(2)=8</code>.
 * @author Sean A. Irvine
 */
public class A276226 extends LinearRecurrence {

  /** Construct the sequence. */
  public A276226() {
    super(new long[] {1, 1, 2}, new long[] {0, 6, 8});
  }
}
