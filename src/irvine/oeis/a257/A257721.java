package irvine.oeis.a257;

import irvine.oeis.LinearRecurrence;

/**
 * A257721 Hexagonal numbers (A000384) that are the sum of two consecutive hexagonal numbers.
 * @author Sean A. Irvine
 */
public class A257721 extends LinearRecurrence {

  /** Construct the sequence. */
  public A257721() {
    super(new long[] {1, -1155, 1155}, new long[] {703, 810901, 935778691});
  }
}
