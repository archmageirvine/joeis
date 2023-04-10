package irvine.oeis.a062;

import java.util.HashSet;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062730 Rows of Pascal's triangle which contain 3 terms in arithmetic progression.
 * @author Sean A. Irvine
 */
public class A062730 extends Sequence1 {

  private int mN = 6;

  @Override
  public Z next() {
    while (true) {
      final Z[] row = new Z[++mN / 2 + 1];
      final HashSet<Z> s = new HashSet<>();
      for (int k = 0; k < row.length; ++k) {
        final Z b = Binomial.binomial(mN, k);
        row[k] = b;
        s.add(b);
      }
      for (int k = 0; k < row.length; ++k) {
        for (int j = k + 1; j < row.length; ++j) {
          final Z d = row[j].subtract(row[k]);
          if (s.contains(row[j].add(d))) {
            return Z.valueOf(mN);
          }
        }
      }
    }
  }
}
