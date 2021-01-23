package irvine.oeis.a155;

import irvine.oeis.LinearRecurrence;

/**
 * A155965 a(n) = n*(n^2+4).
 * @author Sean A. Irvine
 */
public class A155965 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155965() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 5, 16, 39});
  }
}
