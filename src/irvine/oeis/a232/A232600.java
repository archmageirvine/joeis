package irvine.oeis.a232;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A232600 a(n) = Sum_{k=0..n} k^p*q^k, where p=1, q=-2.
 * @author Sean A. Irvine
 */
public class A232600 extends LinearRecurrence {

  /** Construct the sequence. */
  public A232600() {
    super(new long[] {4, 0, -3}, new long[] {0, -2, 6});
  }
}
