package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157956 <code>a(n) = 200*n + 1</code>.
 * @author Sean A. Irvine
 */
public class A157956 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157956() {
    super(new long[] {-1, 2}, new long[] {201, 401});
  }
}
