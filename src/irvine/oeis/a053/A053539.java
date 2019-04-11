package irvine.oeis.a053;

import irvine.oeis.LinearRecurrence;

/**
 * A053539 <code>a(n) = n * 8^(n-1)</code>.
 * @author Sean A. Irvine
 */
public class A053539 extends LinearRecurrence {

  /** Construct the sequence. */
  public A053539() {
    super(new long[] {-64, 16}, new long[] {0, 1});
  }
}
