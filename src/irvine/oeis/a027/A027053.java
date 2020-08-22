package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027053 a(n) = T(n,n+2), T given by A027052.
 * @author Sean A. Irvine
 */
public class A027053 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027053() {
    super(new long[] {-1, 0, 0, 2}, new long[] {1, 4, 9, 18});
  }
}
