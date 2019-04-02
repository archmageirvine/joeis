package irvine.oeis.a032;

import irvine.oeis.LinearRecurrence;

/**
 * A032526 a(n) = floor(5*n^2/2).
 * @author Sean A. Irvine
 */
public class A032526 extends LinearRecurrence {

  /** Construct the sequence. */
  public A032526() {
    super(new long[] {1, -2, 0, 2}, new long[] {0, 2, 10, 22});
  }
}
