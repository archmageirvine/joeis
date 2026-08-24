package irvine.oeis.a086;

import java.util.HashSet;

import irvine.math.LongUtils;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A086342 Smallest number of 1's in binary expansion of any positive multiple of n.
 * @author Sean A. Irvine
 */
public class A086342 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    final long m = Functions.MAKE_ODD.l(mN);
    final long order = Functions.ORDER.l(m, 2);
    final HashSet<Long> v1 = new HashSet<>();
    for (int k = 0; k <= order; ++k) {
      v1.add(LongUtils.modPow(2, k, m));
    }
    HashSet<Long> v = v1;
    long s = 1;
    while (!v.contains(0L)) {
      final HashSet<Long> next = new HashSet<>();
      for (final long a : v) {
        for (final long b : v1) {
          next.add((a + b) % m);
        }
      }
      v = next;
      ++s;
    }
    return Z.valueOf(s);
  }
}
