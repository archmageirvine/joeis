package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157786 <code>a(n) = 27225*n^2 - 15248*n + 2135</code>.
 * @author Sean A. Irvine
 */
public class A157786 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157786() {
    super(new long[] {1, -3, 3}, new long[] {14112, 80539, 201416});
  }
}
