package irvine.oeis.a036;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A036471 Four numbers (a,b,c,d) with a&lt;b&lt;c&lt;d that satisfy sigma(a) = sigma(b) = sigma(c) = sigma(d) = a+b+c+d are called an amicable quadruple. We order these quadruples according to the common value of sigma. The values of (a, b, c, d, sigma) are in (this sequence, A036472, A036473, A036474, A116148) respectively.
 * @author Sean A. Irvine
 */
public class A036471 extends Sequence1 {

  // This is a fairly hard set of sequences -- you need a lot of RAM to run this,
  // but it is capable of reproducing the sequence

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final TreeMap<Long, List<Long>> mSigmaMap = new TreeMap<>();
  private final ArrayList<long[]> mA = new ArrayList<>();
  private int mM = 0;
  private long mN = 1;
  private long mSigma = 13927679;

  protected Z select(final long[] tuple) {
    return Z.valueOf(tuple[0]);
  }

  private long sigma(final long n) {
    if (mVerbose && n % 1000000 == 0) {
      StringUtils.message("Scan has reached: " + n);
    }
    return Functions.SIGMA.l(n);
  }

  @Override
  public Z next() {
    if (mM < mA.size()) {
      return select(mA.get(mM++));
    }
    mA.clear();
    while (mA.isEmpty()) {
      ++mSigma; // Next value of sigma to test
      while (mN < mSigma) {
        final long sigma = sigma(++mN);
        if (sigma >= mSigma) {
          final List<Long> l = mSigmaMap.get(sigma);
          if (l != null) {
            l.add(mN);
          } else {
            final List<Long> newList = new ArrayList<>();
            newList.add(mN);
            mSigmaMap.put(sigma, newList);
          }
        }
      }
      if (mSigmaMap.firstKey() == mSigma) {
        final List<Long> lst = mSigmaMap.pollFirstEntry().getValue();
        if (lst.size() >= 4) {
//          if (mVerbose) {
//            StringUtils.message(mSigma + " has " + lst.size() + " inverses <= " + mSigma);
//          }
          for (int ai = 0; ai < lst.size(); ++ai) {
            final long a = lst.get(ai);
              for (int bi = ai + 1; bi < lst.size() && lst.get(bi) < mSigma - a; ++bi) {
                final long b = lst.get(bi);
                for (int ci = bi + 1; ci < lst.size() && lst.get(ci) < mSigma - a - b; ++ci) {
                  final long c = lst.get(ci);
                  final long d = mSigma - a - b - c;
                  if (d > c) {
                    for (int di = ci + 1; di < lst.size(); ++di) {
                      if (d == lst.get(di)) {
                        mA.add(new long[]{a, b, c, d, mSigma});
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    mM = 0;
    return select(mA.get(mM++));
  }
}
