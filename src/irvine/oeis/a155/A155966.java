package irvine.oeis.a155;

import irvine.oeis.LinearRecurrence;

/**
 * A155966 <code>a(n) = 2*n^2 + 8</code>.
 * @author Sean A. Irvine
 */
public class A155966 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155966() {
    super(new long[] {1, -3, 3}, new long[] {8, 10, 16});
  }
}
