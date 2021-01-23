package irvine.oeis.a108;

import irvine.oeis.FiniteSequence;

/**
 * A108997 Coordination sequence for the 120-cell: number of vertices n steps away from a given vertex on the regular 120-cell (hecatonicosachoron or {3,3,5}).
 * @author Georg Fischer
 */
public class A108997 extends FiniteSequence {

  /** Construct the sequence. */
  public A108997() {
    super(1, 4, 12, 24, 36, 52, 68, 76, 78, 72, 64, 56, 40, 12, 4, 1);
  }
}
