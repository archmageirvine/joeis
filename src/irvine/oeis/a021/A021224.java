package irvine.oeis.a021;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A021224 Expansion of 1/((1-x)*(1-2*x)*(1-7*x)*(1-8*x)).
 * @author Sean A. Irvine
 */
public class A021224 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021224() {
    super(new long[] {-112, 198, -103, 18}, new long[] {1, 18, 221, 2322});
  }
}
