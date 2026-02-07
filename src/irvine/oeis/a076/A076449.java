package irvine.oeis.a076;

import java.util.HashSet;
import java.util.Set;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.Permutation;
import irvine.util.array.DynamicLongArray;
import irvine.util.bumper.Bumper;
import irvine.util.bumper.BumperFactory;

/**
 * A076449 Least number whose digits can be used to form exactly n different primes (not necessarily using all digits).
 * @author Sean A. Irvine
 */
public class A076449 extends Sequence0 {

  private final DynamicLongArray mFirsts = new DynamicLongArray();
  private final Bumper mBumper = BumperFactory.weaklyIncreasingNumbers(9);
  private int mN = -1;
  private int[] mA = {0};

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == 0) {
      if (mBumper.bump(mA)) {
        long t = 0;
        for (final int v : mA) {
          t *= 10;
          t += v;
        }
        final Permutation perm = Permutation.permuter(t);
        int[] p;
        final Set<Z> primes = new HashSet<>();
        while ((p = perm.next()) != null) {
          if (p[0] != 0) {
            Z u = Permutation.permToZ(p);
            do {
              if (u.isProbablePrime()) {
                primes.add(u);
              }
              u = u.divide(10);
            } while (!u.isZero());
          }
        }
        final int cnt = primes.size();
        if (mFirsts.get(cnt) == 0) {
          mFirsts.set(cnt, t);
        }
      } else {
        mA = new int[mA.length + 1];
        mA[0] = 1;
      }
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}
