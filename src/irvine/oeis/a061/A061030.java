package irvine.oeis.a061;

import irvine.factor.factor.PrimeDivision;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A061030.
 * @author Sean A. Irvine
 */
public class A061030 extends Sequence3 {

  private final PrimeDivision mFactor = new PrimeDivision();
  private final FactorSequence mFactorSequence = mFactor.factorize(Z.TWO);
  private long mN = 2;
  private Z mF = Z.TWO;

  protected Z select(final Z x, final Z y, final Z z) {
    return x;
  }

  @Override
  public Z next() {
    mFactorSequence.merge(mFactor.factorize(Z.valueOf(++mN)));
    mF = mF.multiply(mN);
    final Z cubeRoot = mF.root(3);

    final Z[] d = mFactorSequence.divisorsSorted();
    int pos = 0;
    while (d[pos + 1].compareTo(cubeRoot) <= 0) {
      ++pos;
    }
    // maximize x, then minimize z, y is whatever is left
    while (true) {
      final Z x = d[pos];
      for (int k = pos + 2; k < d.length; ++k) { // pos + 1 could be y!
        final Z xz = x.multiply(d[k]);
        final Z[] qr = mF.divideAndRemainder(xz);
        if (qr[1].isZero() && qr[0].compareTo(x) > 0 && qr[0].compareTo(d[k]) < 0) {
          return select(x, qr[0], d[k]);
        }
      }
      --pos;
    }
  }
}
