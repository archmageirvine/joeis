package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157737 a(n) = 441*n^2 - 2*n.
 * @author Sean A. Irvine
 */
public class A157737 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157737() {
    super(1, new long[] {1, -3, 3}, new long[] {439, 1760, 3963});
  }
}
