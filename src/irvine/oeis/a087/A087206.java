package irvine.oeis.a087;

import irvine.oeis.LinearRecurrence;

/**
 * A087206 <code>a(n) = 2*a(n-1) + 4*a(n-2);</code> with <code>a(0)=1, a(1)=4</code>.
 * @author Sean A. Irvine
 */
public class A087206 extends LinearRecurrence {

  /** Construct the sequence. */
  public A087206() {
    super(new long[] {4, 2}, new long[] {1, 4});
  }
}
