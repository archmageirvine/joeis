package irvine.oeis.a068;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A068568 Let S = a subset of {n,n+1,n+2,..,n+m}, number of parts of S is more than 1. a(n) = smallest number m such that the product of parts of S is a square.
 * @author Sean A. Irvine
 */
public class A068568 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    long k = mN;
    final HashSet<Z> products = new HashSet<>();
    while (true) {
      final HashSet<Z> newProducts = new HashSet<>();
      for (final Z p : products) {
        final Z q = p.multiply(k);
        if (q.isSquare()) {
          return Z.valueOf(k - mN);
        }
        newProducts.add(q);
      }
      products.addAll(newProducts);
      products.add(Z.valueOf(k));
      ++k;
    }
  }
}
