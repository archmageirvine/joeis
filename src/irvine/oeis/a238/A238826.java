package irvine.oeis.a238;

import irvine.oeis.LinearRecurrence;

/**
 * A238826.
 * @author Sean A. Irvine
 */
public class A238826 extends LinearRecurrence {

  /** Construct the sequence. */
  public A238826() {
    super(new long[] {-1, 3, 1, 1, -4, 0, 3}, new long[] {1, 2, 4, 9, 22, 53, 131});
  }
}
