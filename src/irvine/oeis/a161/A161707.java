package irvine.oeis.a161;

import irvine.oeis.LinearRecurrence;

/**
 * A161707 <code>a(n) = (4*n^3 - 9*n^2 + 11*n + 3)/3</code>.
 * @author Sean A. Irvine
 */
public class A161707 extends LinearRecurrence {

  /** Construct the sequence. */
  public A161707() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 3, 7, 21});
  }
}
