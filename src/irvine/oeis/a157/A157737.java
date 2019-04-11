package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157737 <code>a(n) = 441*n^2 - 2*n</code>.
 * @author Sean A. Irvine
 */
public class A157737 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157737() {
    super(new long[] {1, -3, 3}, new long[] {439, 1760, 3963});
  }
}
