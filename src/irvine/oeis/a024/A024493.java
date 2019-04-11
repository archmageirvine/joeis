package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024493 <code>a(n) =</code> C(n,0) + C(n,3) <code>+ </code>... + C(n,3[n/3]).
 * @author Sean A. Irvine
 */
public class A024493 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024493() {
    super(new long[] {2, -3, 3}, new long[] {1, 1, 1});
  }
}
