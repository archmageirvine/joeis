package irvine.oeis.a022;

import irvine.math.MemoryFunction2;
import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A022414 Kim-sums: "Kimberling sums" K_n + K_3.
 * @author Sean A. Irvine
 */
public class A022414 extends MemoryFunction2<Integer, Z> implements Sequence {

  // After R. J. Mathar

  // Ki
  @Override
  protected Z compute(final Integer n, final Integer k) {
    if (k == 0) {
      return Z.valueOf(n);
    } else if (k == 1) {
      return CR.PHI.multiply(n + 1).floor();
    } else {
      return get(n, k - 1).add(get(n, k - 2));
    }
  }

  private Z sum(final int n, final int m) {
    final Z[] ks = new Z[5];
    for (int k = 0; k < ks.length; ++k) {
      ks[k] = get(n, k).add(get(m, k));
    }
    for (int k = 0; k <= 2; ++k) {
      for (int a = 0; ; ++a) {
        if (get(a, 0).equals(ks[k]) && get(a, 1).equals(ks[k + 1])) {
          return Z.valueOf(a);
        }
        if (get(a, 0).compareTo(ks[k]) > 0) {
          break;
        }
      }
    }
    throw new RuntimeException();
  }

  protected int index() {
    return 2;
  }

  private int mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.valueOf(index()) : sum(mN - 1, index());
  }
}
