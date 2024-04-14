package irvine.oeis.a366;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A366897 Brilliant 10-pandigital number (semiprimes whose prime factors are 6-digit numbers) whose prime factors are together 10-pandigital.
 * @author Sean A. Irvine
 */
public class A366897 extends Sequence1 {

  private static final long START = 100003;
  private static final int PANDIGITAL = 0b1111111111;
  private final TreeSet<Long> mA = build();

  private TreeSet<Long> build() {
    // Computes the entire list of terms
    final Fast mPrime = new Fast();
    final List<Long> primeList = new ArrayList<>();
    final List<Integer> syndromes = new ArrayList<>();
    final TreeSet<Long> res = new TreeSet<>();
    for (long k = START; k <= 1000000; k = mPrime.nextPrime(k)) {
      final int synK = Functions.SYNDROME.i(k);
      if (Integer.bitCount(synK) >= 4) {
        primeList.add(k);
        syndromes.add(synK);
      }
    }
    for (int k = 0; k < syndromes.size(); ++k) {
      final int synK = syndromes.get(k);
      for (int j = 0; j <= k; ++j) {
        if ((synK | syndromes.get(j)) == PANDIGITAL) {
          final long prod = primeList.get(k) * primeList.get(j);
          if (Functions.SYNDROME.i(prod) == PANDIGITAL) {
            res.add(prod);
          }
        }
      }
    }
    return res;
  }

  @Override
  public Z next() {
    return mA.isEmpty() ? null : Z.valueOf(mA.pollFirst());
  }
}
