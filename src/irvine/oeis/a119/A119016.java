package irvine.oeis.a119;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A119016 Numerators of "Farey fraction" approximations to sqrt(2).
 * @author Sean A. Irvine
 */
public class A119016 extends LinearRecurrence {

  /** Construct the sequence. */
  public A119016() {
    super(new long[] {1, 0, 2, 0}, new long[] {1, 0, 1, 2});
  }
}
