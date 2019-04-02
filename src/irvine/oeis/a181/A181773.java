package irvine.oeis.a181;

import irvine.oeis.LinearRecurrence;

/**
 * A181773 Molecular topological indices of the cocktail party graphs.
 * @author Sean A. Irvine
 */
public class A181773 extends LinearRecurrence {

  /** Construct the sequence. */
  public A181773() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 48, 240, 672});
  }
}
