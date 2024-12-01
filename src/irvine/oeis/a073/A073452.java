package irvine.oeis.a073;

import java.util.ArrayList;
import java.util.List;

/**
 * A073452 a(n) is the number of essentially different ways in which the integers 1,2,3,...,n can be arranged in a sequence such that all pairs of adjacent integers sum to a prime number. Rotations and reversals are counted only once.
 * @author Sean A. Irvine
 */
public class A073452 extends A073451 {

  @Override
  protected int[][] buildTransitions(final int n) {
    final int[][] transitions = new int[n][];
    for (int k = 1; k <= n; ++k) {
      final List<Integer> t = new ArrayList<>();
      for (int j = 1; j <= n; ++j) {
        if (j != k && mPrime.isPrime(j + k)) {
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
