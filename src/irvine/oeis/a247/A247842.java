package irvine.oeis.a247;

import irvine.oeis.LinearRecurrence;

/**
 * A247842 Sum(9^k, k=2..n).
 * @author Sean A. Irvine
 */
public class A247842 extends LinearRecurrence {

  /** Construct the sequence. */
  public A247842() {
    super(new long[] {-9, 10}, new long[] {0, 81});
  }
}
