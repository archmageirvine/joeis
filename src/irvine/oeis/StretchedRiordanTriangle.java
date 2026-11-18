package irvine.oeis;

import irvine.math.series.Series;
import irvine.math.series.SeriesRing;
import irvine.math.z.Z;
import irvine.oeis.gf.GfSequence;

/**
 * Stretched Riordan sequence.
 * @author Sean A. Irvine
 */
public class StretchedRiordanTriangle extends Sequence0 {

  private static final SeriesRing<Z> SZ = SeriesRing.SZ;
  private static final SeriesRing<Series<Z>> RING = new SeriesRing<>(SZ);
  private final Series<Series<Z>> mS;
  private final int mScale;
  private int mN = 0;
  private int mM = -1;

  protected StretchedRiordanTriangle(final Series<Z> g, final Series<Z> f, final int scale) {
    mS = RING.divide(RING.monomial(g, 0), RING.create(SZ.one(), SZ.negate(SZ.shift(f, 1))));
    mScale = scale;
  }

  protected StretchedRiordanTriangle(final String g, final String f, final int scale) {
    this(Series.toZ(Series.create(new GfSequence(0, g))), Series.toZ(Series.create(new GfSequence(0, f))), scale);
  }

  protected StretchedRiordanTriangle(final String g, final String f) {
    this(g, f, 1);
  }

  @Override
  public Z next() {
    if (mScale * ++mM > mN) {
      ++mN;
      mM = 0;
    }
    return mS.coeff(mM).coeff(mN);
  }
}
