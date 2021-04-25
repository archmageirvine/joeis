package irvine.oeis.a046;

import java.util.Arrays;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Permutation;

/**
 * A046810 Number of anagrams of n that are primes.
 * @author Sean A. Irvine
 */
public class A046810 implements Sequence {

  private final Fast mPrime = new Fast();
  protected long mN = 0;

  @Override
  public Z next() {
    long count = 0;
    final String s = String.valueOf(++mN);
    final int[] d = new int[s.length()];
    for (int k = 0; k < d.length; ++k) {
      d[k] = s.charAt(k) - '0';
    }
    Arrays.sort(d);
    final Permutation perm = new Permutation(d);
    int[] p;
    while ((p = perm.next()) != null) {
      if (p[0] != 0) {
        long v = 0;
        for (final int u : p) {
          v *= 10;
          v += u;
        }
        if (mPrime.isPrime(v)) {
          ++count;
        }
      }
    }
    return Z.valueOf(count);
  }
}
