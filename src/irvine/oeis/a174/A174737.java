package irvine.oeis.a174;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A174737 a(n) = a(n-1) - a(n-2), with a(0)=2, a(1)=-1.
 * @author Sean A. Irvine
 */
public class A174737 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174737() {
    super(new long[] {-1, 1}, new long[] {2, -1});
  }
}
