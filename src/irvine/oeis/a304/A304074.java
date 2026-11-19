package irvine.oeis.a304;

import irvine.math.polynomial.CombinatorialSpecies;
import irvine.math.polynomial.CycleIndex;

/**
 * A304074 Number of simple connected graphs with n nodes rooted at a pair of distinguished vertices.
 * @author Gregory Morse
 */
public class A304074 extends A304070 {
  protected A304074(final boolean ordered) {
    super(ordered);
  }

  /** Construct the sequence. */
  public A304074() {
    this(true);
  }

  @Override
  protected CycleIndex cycleIndex(final int n) {
    return CombinatorialSpecies.sLog(CombinatorialSpecies.graphSeries(n)).coeff(n);
  }
}
