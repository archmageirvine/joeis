package irvine.oeis.a265;

import irvine.oeis.LinearRecurrence;

/**
 * A265645 a(n) = n^2 * floor(n/2).
 * @author Sean A. Irvine
 */
public class A265645 extends LinearRecurrence {

  /** Construct the sequence. */
  public A265645() {
    super(new long[] {-1, 1, 3, -3, -3, 3, 1}, new long[] {0, 0, 4, 9, 32, 50, 108});
  }
}
