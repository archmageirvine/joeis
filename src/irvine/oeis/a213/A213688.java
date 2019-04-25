package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213688 <code>a(n) = Sum_{i=0..n}</code> A000129(i)^3.
 * @author Sean A. Irvine
 */
public class A213688 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213688() {
    super(new long[] {1, 11, -42, 18, 13}, new long[] {0, 1, 9, 134, 1862});
  }
}
