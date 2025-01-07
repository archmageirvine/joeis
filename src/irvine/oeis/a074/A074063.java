package irvine.oeis.a074;

import java.util.ArrayList;
import java.util.List;

import irvine.oeis.a073.A073451;

/**
 * A074063 a(n) is the number of essentially different ways in which the integers 1,2,3,...,n can be arranged in a sequence such that (1) adjacent integers sum to a prime number and (2) squares of adjacent numbers sum to a prime number. Rotations and reversals are counted only once.
 * @author Sean A. Irvine
 */
public class A074063 extends A073451 {

  @Override
  protected int[][] buildTransitions(final int n) {
    final int[][] transitions = new int[n][];
    for (int k = 1; k <= n; ++k) {
      final List<Integer> t = new ArrayList<>();
      for (int j = 1; j <= n; ++j) {
        if (j != k && mPrime.isPrime(j + k) && mPrime.isPrime((long) j * j + (long) k * k)) {
          t.add(j);
        }
      }
      transitions[k - 1] = new int[t.size()];
      for (int j = 0; j < t.size(); ++j) {
        transitions[k - 1][j] = t.get(j);
      }
    }
    return transitions;
  }
}
