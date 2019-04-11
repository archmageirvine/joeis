package irvine.oeis.a255;

import irvine.oeis.LinearRecurrence;

/**
 * A255843 <code>a(n) = 2*n^2 + 4</code>.
 * @author Sean A. Irvine
 */
public class A255843 extends LinearRecurrence {

  /** Construct the sequence. */
  public A255843() {
    super(new long[] {1, -3, 3}, new long[] {4, 6, 12});
  }
}
