package irvine.oeis.a100;

import irvine.oeis.LinearRecurrence;

/**
 * A100170 Structured pentagonal hexacontahedral numbers (vertex structure 10).
 * @author Sean A. Irvine
 */
public class A100170 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100170() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 92, 444, 1228});
  }
}
