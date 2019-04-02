package irvine.oeis.a173;

import irvine.oeis.LinearRecurrence;

/**
 * A173205 a(n) = 98*a(n-1)-a(n-2) for n&gt;2, a(1)=1, a(2)=98.
 * @author Sean A. Irvine
 */
public class A173205 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173205() {
    super(new long[] {-1, 98}, new long[] {1, 98});
  }
}
