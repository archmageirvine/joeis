package irvine.oeis.a389;

import java.util.Collection;
import java.util.HashSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A389802 The number of irreducible balanced subsets of [n].
 * @author Sean A. Irvine
 */
public class A389802 extends AbstractSequence {

  private int mN = 0;

  protected A389802(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A389802() {
    this(1);
  }

  private boolean isBalanced(long set, final int n) {
    long sum = 0;
    long c = 0;
    for (int j = 1; set != 0; ++j, set >>>= 1) {
      if ((set & 1) == 1) {
        sum += j;
        ++c;
      }
    }
    return 2 * sum == c * (n + 1); // i.e., sum/c = (n+1)/2
  }

  private boolean isReducible(final long set, final HashSet<Long> irred) {
    for (final long i : irred) {
      if ((set & i) == i) {
        return true;
      }
    }
    return false;
  }

  protected Collection<Long> buildIrreducibleBalancedSamples(final int n) {
    final HashSet<Long> irred = new HashSet<>();
    final long lim = 1L << n;
    for (long k = 1; k < lim; k = 2 * k + 1) {
      final HashSet<Long> irredK = new HashSet<>();
      for (long j = k; j < lim; j = Functions.SWIZZLE.l(j)) {
        if (isBalanced(j, n) && !isReducible(j, irred)) {
          irredK.add(j);
        }
      }
      irred.addAll(irredK);
    }
    return irred;
  }

  @Override
  public Z next() {
    return Z.valueOf(buildIrreducibleBalancedSamples(++mN).size());
  }
}
