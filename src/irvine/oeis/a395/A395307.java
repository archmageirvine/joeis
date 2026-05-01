package irvine.oeis.a395;

import java.util.HashSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;
import irvine.util.array.DynamicLongArray;

/**
 * A395307 allocated for Paolo P. Lava.
 * @author Sean A. Irvine
 */
public class A395307 extends A000040 {

  private final DynamicLongArray mFirsts = new DynamicLongArray();
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == 0) {
      final long p = super.next().longValueExact();
      long q = Functions.NEXT_PRIME.l(p);
      final int len = Functions.DIGIT_LENGTH.i(q);
      final HashSet<Z> primes = new HashSet<>();
      for (int j = 0; j <= len; ++j) {
        final Z t = Z.TEN.pow(j).multiply(p).add(q);
        if (t.isProbablePrime()) {
          primes.add(t);
        }
      }
      final int len2 = Functions.DIGIT_LENGTH.i(p);
      for (int j = 0; j < len2; ++j) {
        final Z t = Z.TEN.pow(j + 1).multiply(q).add(p);
        if (t.isProbablePrime()) {
          primes.add(t);
        }
      }
      final int s = primes.size();
      if (mFirsts.get(s) == 0) {
        mFirsts.set(s, p);
      }
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}

