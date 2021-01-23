package irvine.oeis.a145;

import irvine.oeis.LinearRecurrence;

/**
 * A145980 a(n) = 29 + 73*n + 37*n^2.
 * @author Sean A. Irvine
 */
public class A145980 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145980() {
    super(new long[] {1, -3, 3}, new long[] {29, 139, 323});
  }
}
