package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157263 <code>a(n) = 1728*n - 1320</code>.
 * @author Sean A. Irvine
 */
public class A157263 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157263() {
    super(new long[] {-1, 2}, new long[] {408, 2136});
  }
}
