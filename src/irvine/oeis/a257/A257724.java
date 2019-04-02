package irvine.oeis.a257;

import irvine.oeis.LinearRecurrence;

/**
 * A257724 Hexagonal numbers (A000384) that are the sum of fourteen consecutive hexagonal numbers.
 * @author Sean A. Irvine
 */
public class A257724 extends LinearRecurrence {

  /** Construct the sequence. */
  public A257724() {
    super(new long[] {1, -1, -806402, 806402, 1}, new long[] {35245, 794629045, 28238642425L, 640790268444865L, 22771697546069605L});
  }
}
