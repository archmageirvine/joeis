package irvine.oeis.a082;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A082841 a(n) = 4*a(n-1) - a(n-2) for n&gt;1, a(0)=3, a(1)=9.
 * @author Sean A. Irvine
 */
public class A082841 extends LinearRecurrence {

  /** Construct the sequence. */
  public A082841() {
    super(new long[] {-1, 4}, new long[] {3, 9});
  }
}
