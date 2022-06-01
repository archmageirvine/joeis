package irvine.oeis.a103;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A103380 k=12 case of family of sequences beyond Fibonacci and Padovan: a(n) = a(n-12) + a(n-13).
 * @author Sean A. Irvine
 */
public class A103380 extends LinearRecurrence {

  /** Construct the sequence. */
  public A103380() {
    super(new long[] {1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1});
  }
}
