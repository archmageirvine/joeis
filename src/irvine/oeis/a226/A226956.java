package irvine.oeis.a226;

import irvine.oeis.LinearRecurrence;

/**
 * A226956 <code>a(0)=a(1)=1, a(n+2) = a(n+1) + a(n) -</code> A128834(n).
 * @author Sean A. Irvine
 */
public class A226956 extends LinearRecurrence {

  /** Construct the sequence. */
  public A226956() {
    super(new long[] {1, 0, -1, 2}, new long[] {1, 1, 2, 2});
  }
}
