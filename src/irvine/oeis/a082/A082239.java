package irvine.oeis.a082;

import java.util.ArrayList;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082239 Infinite table filled by antidiagonals with smallest numbers such that every partial concatenation of a row or a column gives a prime.
 * @author Sean A. Irvine
 */
public class A082239 extends Sequence1 {

  private final List<String> mRowConcats = new ArrayList<>();
  private final List<String> mColConcats = new ArrayList<>();
  private int mN = -1;
  private int mM = 0;

  private Z t(final int n, final int m) {
    long k = 0;
    while (true) {
      ++k;
      final String r = mRowConcats.get(n) + k;
      if (new Z(r).isProbablePrime()) {
        final String c = mColConcats.get(m) + k;
        if (new Z(c).isProbablePrime()) {
          mRowConcats.set(n, r);
          mColConcats.set(m, c);
          return Z.valueOf(k);
        }
      }
    }
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
      mRowConcats.add("");
      mColConcats.add("");
    }
    return t(mM, mN - mM);
  }
}
