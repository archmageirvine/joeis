package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033579 Four times pentagonal numbers: a(n) = 2*n*(3*n-1).
 * @author Sean A. Irvine
 */
public class A033579 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033579() {
    super(new long[] {1, -3, 3}, new long[] {0, 4, 20});
  }
}
