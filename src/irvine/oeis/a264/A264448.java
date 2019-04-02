package irvine.oeis.a264;

import irvine.oeis.LinearRecurrence;

/**
 * A264448 a(n) = n*(n + 11)*(n + 22)*(n + 33)/24.
 * @author Sean A. Irvine
 */
public class A264448 extends LinearRecurrence {

  /** Construct the sequence. */
  public A264448() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 391, 910, 1575, 2405});
  }
}
