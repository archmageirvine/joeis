package irvine.oeis.a218;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A218731 a(n) = (28^n - 1)/27.
 * @author Sean A. Irvine
 */
public class A218731 extends LinearRecurrence {

  /** Construct the sequence. */
  public A218731() {
    super(new long[] {-28, 29}, new long[] {0, 1});
  }
}
