package irvine.oeis.a021;

import irvine.oeis.LinearRecurrence;

/**
 * A021224 Expansion of 1/((1-x)(1-2x)(1-7x)(1-8x)).
 * @author Sean A. Irvine
 */
public class A021224 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021224() {
    super(new long[] {-112, 198, -103, 18}, new long[] {1, 18, 221, 2322});
  }
}
