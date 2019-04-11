package irvine.oeis.a257;

import irvine.oeis.LinearRecurrence;

/**
 * A257287 <code>a(n) = 6*7^n - 5*6^n</code>.
 * @author Sean A. Irvine
 */
public class A257287 extends LinearRecurrence {

  /** Construct the sequence. */
  public A257287() {
    super(new long[] {-42, 13}, new long[] {1, 12});
  }
}
