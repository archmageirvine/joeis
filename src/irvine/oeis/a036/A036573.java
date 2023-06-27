package irvine.oeis.a036;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A036573 Size of maximal triangulation of an n-antiprism with regular polygonal base.
 * @author Sean A. Irvine
 */
public class A036573 extends LinearRecurrence {

  /** Construct the sequence. */
  public A036573() {
    super(3, new long[] {1, -2, 0, 2}, new long[] {4, 8, 12, 17});
  }
}
