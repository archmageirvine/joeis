package irvine.oeis.a084;

import irvine.oeis.LinearRecurrence;

/**
 * A084059 a(n) = 4*a(n-1)+2*a(n-2) for n&gt;1, a(0)=1, a(1)=2.
 * @author Sean A. Irvine
 */
public class A084059 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084059() {
    super(new long[] {2, 4}, new long[] {1, 2});
  }
}
