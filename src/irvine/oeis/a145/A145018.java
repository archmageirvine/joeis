package irvine.oeis.a145;

import irvine.oeis.LinearRecurrence;

/**
 * A145018 a(n) = (n^2 - n + 8)/2.
 * @author Sean A. Irvine
 */
public class A145018 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145018() {
    super(new long[] {1, -3, 3}, new long[] {4, 5, 7});
  }
}
