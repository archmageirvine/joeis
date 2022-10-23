package irvine.oeis.a007;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Permutation;

/**
 * A007763 Number of pairs of length n permutations achievable by double-ended priority queue.
 * @author Sean A. Irvine
 */
public class A007763 extends Sequence1 {

  private int mN = 0;

  private boolean isAchievable(final int[] tau, final int[] sigma) {
    final TreeSet<Integer> deq = new TreeSet<>();
    int i = 0;
    int j = 0;
    while (j < tau.length) {
      while (!deq.contains(tau[j])) {
        deq.add(sigma[i++]);
      }
      if (deq.first() == tau[j]) {
        deq.pollFirst(); // removes first
        ++j;
      } else if (deq.last() == tau[j]) {
        deq.pollLast(); // removes last
        ++j;
      } else {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    long count = 0;
    final Permutation tauGen = new Permutation(++mN);
    int[] tau;
    while ((tau = tauGen.next()) != null) {
      final Permutation sigmaGen = new Permutation(mN);
      int[] sigma;
      while ((sigma = sigmaGen.next()) != null) {
        if (isAchievable(tau, sigma)) {
          ++count;
        }
      }
    }
    return Z.valueOf(count);
  }
}
