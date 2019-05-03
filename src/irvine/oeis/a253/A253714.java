package irvine.oeis.a253;

import irvine.oeis.LinearRecurrence;

/**
 * A253714 Indices of hexagonal numbers <code>(A000384)</code> which are also centered heptagonal numbers <code>(A069099)</code>.
 * @author Sean A. Irvine
 */
public class A253714 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253714() {
    super(new long[] {1, -1, -64514, 64514, 1}, new long[] {1, 2857, 45529, 184300369, 2937241777L});
  }
}
