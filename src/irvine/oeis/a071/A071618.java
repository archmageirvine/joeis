package irvine.oeis.a071;

import irvine.oeis.LinearRecurrence;

/**
 * A071618 <code>a(n+1) - 3*a(n) + a(n-1) =</code> (2/3)(1+w^(n+1)+w^(2n+2)), where w <code>= exp(2</code> Pi I <code>/ 3)</code>.
 * @author Sean A. Irvine
 */
public class A071618 extends LinearRecurrence {

  /** Construct the sequence. */
  public A071618() {
    super(new long[] {1, -3, 1, -1, 3}, new long[] {0, 1, 3, 8, 23});
  }
}
