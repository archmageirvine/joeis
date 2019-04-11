package irvine.oeis.a239;

import irvine.oeis.LinearRecurrence;

/**
 * A239794 <code>5*n^2 + 4*n - 15</code>.
 * @author Sean A. Irvine
 */
public class A239794 extends LinearRecurrence {

  /** Construct the sequence. */
  public A239794() {
    super(new long[] {1, -3, 3}, new long[] {-6, 13, 42});
  }
}
