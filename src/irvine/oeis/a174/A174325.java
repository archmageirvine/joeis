package irvine.oeis.a174;

import irvine.oeis.LinearRecurrence;

/**
 * A174325 Trisection <code>A061037(3*n-2)</code> of the Balmer spectrum numerators extended to negative indices.
 * @author Sean A. Irvine
 */
public class A174325 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174325() {
    super(new long[] {1, 0, 0, 0, -3, 0, 0, 0, 3, 0, 0, 0}, new long[] {0, -3, 3, 45, 6, 165, 63, 357, 30, 621, 195, 957});
  }
}
