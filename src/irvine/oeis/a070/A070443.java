package irvine.oeis.a070;

import irvine.oeis.LinearRecurrence;

/**
 * A070443 a(n) = n^2 mod 21.
 * @author Sean A. Irvine
 */
public class A070443 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070443() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {0, 1, 4, 9, 16, 4, 15, 7, 1, 18, 16, 16, 18, 1, 7, 15, 4, 16, 9, 4, 1});
  }
}
