package irvine.oeis.a393;

import java.util.ArrayList;
import java.util.List;

import irvine.math.series.AbstractInfiniteSeries;
import irvine.math.series.Series;
import irvine.math.series.SeriesRing;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A393490.
 * @author Sean A. Irvine
 */
public class A393918 extends Sequence1 {

  private static final SeriesRing<Z> SZ = SeriesRing.SZ;
  private static final Series<Z> NUM = SZ.oneMinusXToTheN(1);
  private int mN = 0;
  private int mM = 0;
  private final List<Series<Z>> mColGfs = new ArrayList<>();
  {
    // Special case for column 1
    mColGfs.add(new AbstractInfiniteSeries<>() {
      @Override
      public Z coeff(final long n) {
        return n == 0 ? Z.ONE : Z.ONE.shiftLeft(n - 1);
      }
    });
  }

  @Override
  public Z next() {
    if (++mM >= mN) {
      mM = 0;
      if (++mN > 1) {
        final long t = mN;
        mColGfs.add(SZ.divide(NUM, new Series<>() {
          @Override
          public Z coeff(final long n) {
            if (n == 0) {
              return Z.ONE;
            }
            return n == 1 || n == t ? Z.NEG_ONE : Z.ZERO;
          }

          @Override
          public long bound() {
            return t;
          }
        }));
      }
    }
    return mColGfs.get(mM).coeff(mN);
  }
}
