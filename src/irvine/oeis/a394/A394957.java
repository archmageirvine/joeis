package irvine.oeis.a394;

import java.util.ArrayList;
import java.util.HashSet;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A394957 Numbers k for which the pairwise sumset of the distinct binomial coefficients in row k of Pascal's triangle is not maximal.
 * @author Sean A. Irvine
 */
public class A394957 extends Sequence1 {

  private long mK = 5;

  @Override
  public Z next() {
    while (true) {
      ++mK;
      final int m = (int) (mK / 2);
      final ArrayList<Z> b = new ArrayList<>(m + 1);
      for (int k = 0; k <= m; ++k) {
        b.add(Binomial.binomial(mK, k));
      }
      final HashSet<Z> seen = new HashSet<>();
      for (int i = 0; i <= m; ++i) {
        final Z bi = b.get(i);
        for (int j = i; j <= m; ++j) {
          if (!seen.add(bi.add(b.get(j)))) {
            return Z.valueOf(mK);
          }
        }
      }
    }
  }
}
