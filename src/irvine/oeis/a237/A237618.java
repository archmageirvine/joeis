package irvine.oeis.a237;

import irvine.oeis.LinearRecurrence;

/**
 * A237618 <code>a(n) = n*(n + 1)*(19*n - 16)/6</code>.
 * @author Sean A. Irvine
 */
public class A237618 extends LinearRecurrence {

  /** Construct the sequence. */
  public A237618() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 1, 22, 82});
  }
}
