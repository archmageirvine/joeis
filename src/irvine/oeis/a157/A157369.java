package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157369 a(n) = 343*n - 273.
 * @author Sean A. Irvine
 */
public class A157369 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157369() {
    super(new long[] {-1, 2}, new long[] {70, 413});
  }
}
