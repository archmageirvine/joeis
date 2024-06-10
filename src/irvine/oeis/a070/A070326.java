package irvine.oeis.a070;

import java.util.HashSet;
import java.util.Set;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070326 Upper triangular array giving for each (x,y) the minimum modulus m such that x^3+y^3 is not congruent to a cube (mod m).
 * @author Sean A. Irvine
 */
public class A070326 extends Sequence1 {

  private long mN = 0;
  private Z mN3 = null;
  private long mM = 0;

  private Set<Long> cubes(final long n) {
    final HashSet<Long> cubes = new HashSet<>();
    for (long k = 0; k < n; ++k) {
      cubes.add(LongUtils.modPow(k, 3, n));
    }
    return cubes;
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      mN3 = Z.valueOf(++mN).pow(3);
      mM = 1;
    }
    long mod = 3;
    while (true) {
      final Set<Long> cubes = cubes(++mod);
      if (!cubes.contains((mN3.mod(mod) + LongUtils.modPow(mM, 3, mod)) % mod)) {
        return Z.valueOf(mod);
      }
    }
  }
}
