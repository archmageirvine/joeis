package irvine.oeis.a389;

import java.util.ArrayList;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a011.A011757;

/**
 * A080825.
 * @author Sean A. Irvine
 */
public class A389525 extends Sequence0 {

  private final Sequence mS = new A011757();
  private long mN = -1;
  private final ArrayList<Long> mP = new ArrayList<>();

  private long pp(final int n) {
    while (n >= mP.size()) {
      mP.add(mS.next().longValueExact());
    }
    return mP.get(n);
  }

  @Override
  public Z next() {
    mN += 2;
    long cnt = 0;
    for (int m = 0; 2 * pp(m) <= mN; ++m) {
      final long u = mN - 2 * pp(m);
      for (int k = m; pp(k) <= u; ++k) {
        final long v = u - pp(k);
        for (int j = k; pp(j) <= v; ++j) {
          final long w = v - pp(j);
          if (Predicates.PRIME.is(w)) {
            // Remains to check w is p(i^2) for some i
            int i = j;
            while (pp(i) <= w) {
              if (pp(i) == w) {
                ++cnt;
                break;
              }
              ++i;
            }
          }
        }
      }
    }
    return Z.valueOf(cnt);
  }
}

