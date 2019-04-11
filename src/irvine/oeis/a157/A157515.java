package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157515 <code>a(n) = 1000*n - 20</code>.
 * @author Sean A. Irvine
 */
public class A157515 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157515() {
    super(new long[] {-1, 2}, new long[] {980, 1980});
  }
}
