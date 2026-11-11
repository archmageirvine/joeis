package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A087338 a(1) = 1, then the smallest number &gt; 1 such that both every partial sum and every partial product + 1 are prime for n &gt; 1.
 * @author Sean A. Irvine
 */
public class A087338 extends Sequence1 {

  private Z mSum = null;
  private Z mProd = Z.ONE;

  @Override
  public Z next() {
    if (mSum == null) {
      mSum = Z.ONE;
      return Z.ONE;
    }
    long k = 1;
    while (true) {
      final Z s = mSum.add(++k);
      if (s.isProbablePrime()) {
        final Z pr = mProd.multiply(k);
        if (pr.add(1).isProbablePrime()) {
          mProd = pr;
          mSum = s;
          return Z.valueOf(k);
        }
      }
    }
  }
}

