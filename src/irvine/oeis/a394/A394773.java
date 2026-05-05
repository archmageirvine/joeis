package irvine.oeis.a394;

import java.util.HashSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a005.A005097;
import irvine.util.array.DynamicLongArray;

/**
 * A394773 Let k and k+1 be two consecutive integers. Let x be the even number and y the odd one, and compute the different sums x*10^j + y, where 0 &lt;= j &lt;= (number of digits of y). a(n) is the smallest integer k that, together with k+1, generates exactly n distinct primes through the process described.
 * @author Sean A. Irvine
 */
public class A394773 extends A005097 {

  private final DynamicLongArray mFirsts = new DynamicLongArray();
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == 0) {
      final long k = super.next().longValueExact();
      final long kk = k + 1;
      final int len1 = Functions.DIGIT_LENGTH.i(kk);
      final HashSet<Z> primes = new HashSet<>();
      for (int j = 0; j <= len1; ++j) {
        final Z t = Z.TEN.pow(j).multiply(k).add(kk);
        if (t.isProbablePrime()) {
          primes.add(t);
        }
      }
      final int len2 = Functions.DIGIT_LENGTH.i(k);
      for (int j = 0; j < len2; ++j) {
        final Z t = Z.TEN.pow(j + 1).multiply(kk).add(k);
        if (t.isProbablePrime()) {
          primes.add(t);
        }
      }
      final int s = primes.size();
      if (mFirsts.get(s) == 0) {
        mFirsts.set(s, k);
      }
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}

