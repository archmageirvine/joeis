package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.LongDynamicLongArray;

/**
 * A010033 The one-sided one-lie R\u00e9nyi-Ulam game: a(n) is the maximum size of a set M such that one can determine a chosen element x with at most n questions of the form "Is x in T?" for some set T, when the answer can be a lie once, but only when the true answer is Yes.
 * @author Sean A. Irvine
 */
public class A010033 extends Sequence0 {

  // After M. F. Hasler

  private LongDynamicLongArray mW = new LongDynamicLongArray();
  private int mN = -1;

  public A010033() {
    mW.set(0, 1);
    mW.set(1, 0);
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    final LongDynamicLongArray newW = new LongDynamicLongArray();
    long x = 0;
    long startK = 0;
    while (true) {
      long maxY = -1;
      long bestK = startK;

      final long lo = Math.max(x - mW.length() + 1, startK);
      final long hi = Math.min(x + 1, mW.length());

      for (long k = lo; k < hi; ++k) {
        if (k <= mW.get(x - k)) {
          final long val = mW.get(k) + mW.get(x - k) - k;
          if (val < maxY) {
            break; // Dropped below peak
          }
          maxY = val;
          bestK = k;
        }
      }

      if (maxY == -1) {
        break;
      }

      newW.set(newW.length(), maxY);
      startK = bestK;
      ++x;
    }
    mW = newW;
//    long max = 0;
//    for (long k = 0; k < mW.length(); ++k) {
//      max = Math.max(max, mW.get(k));
//    }
//    System.out.println(mN + " " + (x-1) + " len=" + mW.length() + " max=" + max);
    return Z.valueOf(x - 1);
  }
}
