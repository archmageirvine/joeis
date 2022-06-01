package irvine.oeis.a005;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A005386 Area of n-th triple of squares around a triangle.
 * @author Sean A. Irvine
 */
public class A005386 extends LinearRecurrence {

  /** Construct the sequence. */
  public A005386() {
    super(new long[] {-1, 4, 4}, new long[] {1, 3, 16});
  }
}
