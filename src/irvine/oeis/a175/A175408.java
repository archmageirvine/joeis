package irvine.oeis.a175;

import irvine.oeis.LinearRecurrence;

/**
 * A175408 a(n) + a(n - 1) is alternatively a cube or a square.
 * @author Sean A. Irvine
 */
public class A175408 extends LinearRecurrence {

  /** Construct the sequence. */
  public A175408() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 7, 2, 6, 3, 5, 4, 4, 5, 3});
  }
}
