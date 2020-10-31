package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.PositionSubsequence;

/**
 * A036417 Values of n for which there are no empty intervals when fractional part(m*Pi) for m = 1, ..., n is plotted along [ 0, 1 ] subdivided into n equal regions.
 * @author Sean A. Irvine
 */
public class A036417 extends PositionSubsequence {

  /** Construct the sequence. */
  public A036417() {
    super(new A036416(), 1);
  }

  @Override
  public boolean isOk(final Z term) {
    return Z.ZERO.equals(term);
  }
}
