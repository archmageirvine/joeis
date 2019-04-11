package irvine.oeis.a103;

import irvine.oeis.LinearRecurrence;

/**
 * A103380 k=12 case of family of sequences beyond Fibonacci and Padovan: <code>a(n) = a(n-12) + a(n-13)</code>.
 * @author Sean A. Irvine
 */
public class A103380 extends LinearRecurrence {

  /** Construct the sequence. */
  public A103380() {
    super(new long[] {1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1});
  }
}
