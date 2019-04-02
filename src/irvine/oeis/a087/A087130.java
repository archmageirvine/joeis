package irvine.oeis.a087;

import irvine.oeis.LinearRecurrence;

/**
 * A087130 a(n) = 5*a(n-1)+a(n-2) for n&gt;1, a(0)=2, a(1)=5.
 * @author Sean A. Irvine
 */
public class A087130 extends LinearRecurrence {

  /** Construct the sequence. */
  public A087130() {
    super(new long[] {1, 5}, new long[] {2, 5});
  }
}
