package irvine.oeis.a389;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A389009 Numbers of the form j^k*h^i = k^j*i^h where h, i, j, and k are distinct integers greater than one.
 * @author Sean A. Irvine
 */
public class A389009 extends Sequence1 {

  private final TreeSet<Z> mS = new TreeSet<>();
  private long mH = 5;
  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));

  @Override
  public Z next() {
    while (mS.isEmpty() || mS.first().compareTo(Z.THREE.pow(mH)) >= 0) {
      for (long i = 2; i < mH; ++i) {
        for (long j = 2; j < mH; ++j) {
          if (j != i) {
            for (long k = 2; k < mH; ++k) {
              if (k != i && k != j) {
                final Z a = Z.valueOf(j).pow(k).multiply(Z.valueOf(mH).pow(i));
                final Z b = Z.valueOf(k).pow(j).multiply(Z.valueOf(i).pow(mH));
                if (a.equals(b)) {
                  mS.add(a);
                  if (mVerbose) {
                    StringUtils.message(a + " (" + mH + "," + i + "," + j + "," + k + ") is a solution");
                  }
                }
              }
            }
          }
        }
      }
      ++mH;
    }
    return mS.pollFirst();
  }
}
