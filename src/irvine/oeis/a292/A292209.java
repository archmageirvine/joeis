package irvine.oeis.a292;

import irvine.oeis.LinearRecurrence;

/**
 * A292209 Number of cliques in the n-Menger sponge graph.
 * @author Sean A. Irvine
 */
public class A292209 extends LinearRecurrence {

  /** Construct the sequence. */
  public A292209() {
    super(new long[] {160, -188, 29}, new long[] {45, 1073, 22977});
  }
}
