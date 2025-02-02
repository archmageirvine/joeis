package irvine.oeis.a074;

import java.util.TreeSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074896 Squares written backwards and sorted, duplicates removed.
 * @author Sean A. Irvine
 */
public class A074896 extends Sequence1 {

  private final TreeSet<Z> mA = new TreeSet<>();
  private long mM = 1;
  private long mLim1 = 1;
  private long mLim = 10;

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      long s;
      while ((s = mM * mM) < mLim) {
        final long r = Functions.REVERSE.l(s);
        if (r >= mLim1) {
          mA.add(Z.valueOf(r));
        }
        ++mM;
      }
      mLim1 *= 10;
      mLim *= 10;
    }
    return mA.pollFirst();
  }
}
