package irvine.oeis.a074;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import irvine.oeis.a073.A073451;

/**
 * A074063 a(n) is the number of essentially different ways in which the integers 1,2,3,...,n can be arranged in a sequence such that (1) adjacent integers sum to a prime number and (2) squares of adjacent numbers sum to a prime number. Rotations and reversals are counted only once.
 * @author Sean A. Irvine
 */
public class A074063 extends A073451 {

  private boolean checkConnected(final int[][] transitions) {
    // If the transitions do not form a single connected components, then a solution will be impossible
    final boolean[] seen = new boolean[transitions.length];
    final LinkedList<Integer> queue = new LinkedList<>();
    seen[0] = true;
    for (final int v : transitions[0]) {
      seen[v - 1] = true;
      queue.add(v);
    }
    while (!queue.isEmpty()) {
      final int u = queue.pollFirst();
      for (final int v : transitions[u - 1]) {
        if (!seen[v - 1]) {
          queue.add(v);
          seen[v - 1] = true;
        }
      }
    }
    for (final boolean v : seen) {
      if (!v) {
        return false;
      }
    }
    return true;
  }

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
    if (!checkConnected(transitions)) {
      // There is no possible solution
      return new int[n][0];
    }
    return transitions;
  }
}
