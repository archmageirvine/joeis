package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.PositionSubsequence;

/**
 * A046158 Values of n for which there are no empty intervals when frac(m gamma) for m = 1, ..., n is plotted along [ 0, 1 ] subdivided into n equal regions.
 * @author Sean A. Irvine
 */
public class A046158 extends PositionSubsequence {

  /** Construct the sequence. */
  public A046158() {
    super(1, new A046157());
  }

  @Override
  public boolean isOk(final Z term) {
    return term.isZero();
  }
}
