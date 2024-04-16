package irvine.oeis.a065;

import java.util.TreeSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A065571 Numbers whose decimal digits can be permuted to give a multiple of 11.
 * @author Sean A. Irvine
 */
public class A065571 extends Sequence0 {

  private final TreeSet<Long> mMultiplesOf11 = new TreeSet<>();
  private long mN = -1;
  private long mE = 0;
  private long mLim = 10;

  {
    mMultiplesOf11.add(0L);
  }

  @Override
  public Z next() {
    while (true) {
      final Z n = Z.valueOf(++mN);
      if (mN >= mLim) {
        mLim *= 10;
        while (mE < mLim) {
          mE += 11;
          mMultiplesOf11.add(Functions.DIGIT_SORT_ASCENDING.z(Z.valueOf(mE)).longValueExact());
        }
      }
      final long t = Functions.DIGIT_SORT_ASCENDING.z(n).longValueExact();
      if (mMultiplesOf11.contains(t)) {
        return n;
      }
    }
  }
}
