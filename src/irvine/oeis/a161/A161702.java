package irvine.oeis.a161;

import irvine.oeis.LinearRecurrence;

/**
 * A161702 <code>a(n) = (-n^3 + 9n^2 - 5n + 3)/3</code>.
 * @author Sean A. Irvine
 */
public class A161702 extends LinearRecurrence {

  /** Construct the sequence. */
  public A161702() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 2, 7, 14});
  }
}
