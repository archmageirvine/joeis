package irvine.oeis.a046;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A046705 Palindromic primes whose product of digits is a prime.
 * @author Sean A. Irvine
 */
public class A046705 implements Sequence {

  private static final long[] PRIME_DIGITS = {2, 3, 5, 7};
  private final TreeSet<Z> mA = new TreeSet<>();
  private int mNumberOfOnes = -1;

  @Override
  public Z next() {
    while (mA.isEmpty()) {
      final String ones = StringUtils.rep('1', ++mNumberOfOnes);
      for (final long d : PRIME_DIGITS) {
        final Z t = new Z(ones + d + ones);
        if (t.isProbablePrime()) {
          mA.add(t);
        }
      }
    }
    return mA.pollFirst();
  }
}
