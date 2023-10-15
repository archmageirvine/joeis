package irvine.oeis.a245;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A245530 a(n) = smallest square which is the product of a minimal set of distinct numbers not less than n.
 * @author Sean A. Irvine
 */
public class A245530 extends Sequence1 {

  private long mN = 0;

  private boolean isSquare(final Z n) {
    return n.sqrtAndRemainder()[1].isZero();
  }

  @Override
  public Z next() {
    final Z n = Z.valueOf(++mN);
    if (n.isSquare()) {
      return n;
    }
    final ArrayList<Z> products = new ArrayList<>();
    products.add(n);
    long k = 0;
    while (true) {
      final Z next = Z.valueOf(mN + ++k);
      final int lim = products.size();
      for (int j = 0; j < lim; ++j) {
        final Z p = products.get(j).multiply(next);
        if (isSquare(p)) {
          return p;
        }
        products.add(p);
      }
    }
  }
}
