package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157919 <code>a(n) = 50*n^2 - 1</code>.
 * @author Sean A. Irvine
 */
public class A157919 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157919() {
    super(new long[] {1, -3, 3}, new long[] {49, 199, 449});
  }
}
