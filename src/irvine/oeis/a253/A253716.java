package irvine.oeis.a253;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A253716 Hexagonal numbers (A000384) which are also centered heptagonal numbers (A069099).
 * @author Sean A. Irvine
 */
public class A253716 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253716() {
    super(new long[] {-1, 0, 4162056194L, 0}, new long[] {1, 16322041, 4145734153L, 67933251842771953L});
  }
}
