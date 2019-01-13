package irvine.oeis.a238;

import irvine.oeis.LinearRecurrence;

/**
 * A238600.
 * @author Sean A. Irvine
 */
public class A238600 extends LinearRecurrence {

  /** Construct the sequence. */
  public A238600() {
    super(new long[] {-1, 14, 90, -350, 90, 14}, new long[] {1, 28, 408, 7896, 137555, 2496144});
  }
}
