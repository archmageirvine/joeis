package irvine.oeis.a276;

import irvine.oeis.LinearRecurrence;

/**
 * A276229 <code>a(n+3) = -a(n+2) - 2*a(n+1) + a(n)</code> with <code>a(0)=0, a(1)=0, a(2)=1</code>.
 * @author Sean A. Irvine
 */
public class A276229 extends LinearRecurrence {

  /** Construct the sequence. */
  public A276229() {
    super(new long[] {1, -2, -1}, new long[] {0, 0, 1});
  }
}
