package irvine.oeis.a340;

import irvine.math.polynomial.CycleIndex;
import irvine.oeis.a002.A002218;
import irvine.oeis.a304.A304070;

/**
 * A340028 Number of unlabeled 2-connected graphs with n vertices rooted at a pair of noninterchangeable vertices.
 * @author Gregory Morse
 */
public class A340028 extends A304070 {
  protected A340028(final boolean ordered) {
    super(ordered);
  }

  /** Construct the sequence. */
  public A340028() {
    this(true);
  }

  @Override
  protected CycleIndex cycleIndex(final int n) {
    return A002218.blockSeries(n).coeff(n);
  }
}
