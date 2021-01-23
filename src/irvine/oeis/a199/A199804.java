package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199804 G.f.: 1/(1+x+x^3).
 * @author Sean A. Irvine
 */
public class A199804 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199804() {
    super(new long[] {-1, 0, -1}, new long[] {1, -1, 1});
  }
}
