package irvine.oeis.a046;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A046703 Multiplicative primes: product of digits is a prime.
 * @author Sean A. Irvine
 */
public class A046703 extends Sequence1 {

  private static final long[] PRIME_DIGITS = {2, 3, 5, 7};
  private final TreeSet<Z> mA = new TreeSet<>();
  private int mNumberOfOnes = -1;

  @Override
  public Z next() {
    while (mA.isEmpty()) {
      final String ones = StringUtils.rep('1', ++mNumberOfOnes);
      for (int k = 0; k <= ones.length(); ++k) {
        final String prefix = ones.substring(0, k);
        final String suffix = ones.substring(k);
        for (final long d : PRIME_DIGITS) {
          final Z t = new Z(prefix + d + suffix);
          if (t.isProbablePrime()) {
            mA.add(t);
          }
        }
      }
    }
    return mA.pollFirst();
  }
}
