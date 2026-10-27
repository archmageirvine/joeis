package irvine.oeis.a087;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import irvine.math.z.Z;
import irvine.oeis.ParallelPermutationSequence;

/**
 * A087034 Number of distinct values taken on by f(P) = Sum_{i=1..n} p(i)*p(n+1-i) as {p(1),p(2),...,p(n)} ranges over all permutations P of {1,2,3,...n}.
 * @author Sean A. Irvine
 */
public class A087034 extends ParallelPermutationSequence {

  private final Set<Integer> mSet = ConcurrentHashMap.newKeySet();

  /** Construct the sequence. */
  public A087034() {
    super(0);
  }

  @Override
  protected long count(final int[] p) {
    int sum = 0;
    for (int k = 0; k < p.length; ++k) {
      sum += (p[k] + 1) * (p[p.length - k - 1] + 1);
    }
    mSet.add(sum);
    return 1;
  }

  @Override
  protected boolean accept(final int[] p, final int sum, final int pos) {
    return pos < 1 || p[0] == 0;
  }

  @Override
  public Z next() {
    mSet.clear();
    super.next();
    return Z.valueOf(mSet.size());
  }
}
