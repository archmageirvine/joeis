package irvine.oeis.a253;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A253714 Indices of hexagonal numbers (A000384) which are also centered heptagonal numbers (A069099).
 * @author Sean A. Irvine
 */
public class A253714 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253714() {
    super(1, new long[] {1, -1, -64514, 64514, 1}, new long[] {1, 2857, 45529, 184300369, 2937241777L});
  }
}
