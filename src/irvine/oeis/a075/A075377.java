package irvine.oeis.a075;

import java.util.TreeSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075377 Triangle read by rows in which n-th row gives all values of n!/{(p!)^a*(q!)^b*(r!)^c*...} (in increasing order) for all factorizations n = p^a*q^b*r^c*....
 * @author Sean A. Irvine
 */
public class A075377 extends Sequence1 {

  private final TreeSet<Z> mA = new TreeSet<>();
  private long mN = 0;

  private void search(final long remaining, final Z prod, final long prev) {
    mA.add(prod.divide(Functions.FACTORIAL.z(remaining)));
    for (long k = prev; k * k <= remaining; ++k) {
      if (remaining % k == 0) {
        final Z p = prod.divide(Functions.FACTORIAL.z(k));
        search(remaining / k, p, k);
      }
    }
  }

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      search(++mN, Functions.FACTORIAL.z(mN), 2);
    }
    return mA.pollFirst();
  }
}
