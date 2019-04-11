package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027973 <code>a(n) =</code> T(n,n) + T(n,n+1) <code>+ </code>... + T(n,2n), T given by A027960.
 * @author Sean A. Irvine
 */
public class A027973 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027973() {
    super(new long[] {-2, -1, 3}, new long[] {1, 4, 9});
  }
}
