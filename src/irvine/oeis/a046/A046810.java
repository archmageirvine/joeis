package irvine.oeis.a046;

import java.util.Arrays;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Permutation;

/**
 * A046810 Number of anagrams of n that are primes.
 * @author Sean A. Irvine
 */
public class A046810 extends Sequence1 {

  protected long mN = 0;

  static long numberOfPrimeAnagrams(final String s) {
    long count = 0;
    final int[] d = new int[s.length()];
    for (int k = 0; k < d.length; ++k) {
      d[k] = s.charAt(k) - '0';
    }
    Arrays.sort(d);
    final Permutation perm = new Permutation(d);
    int[] p;
    while ((p = perm.next()) != null) {
      if (p[0] != 0 && Permutation.permToZ(p).isProbablePrime()) {
        ++count;
      }
    }
    return count;
  }

  @Override
  public Z next() {
    return Z.valueOf(numberOfPrimeAnagrams(String.valueOf(++mN)));
  }
}
