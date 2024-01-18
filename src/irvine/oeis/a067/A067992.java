package irvine.oeis.a067;

import java.util.HashSet;
import java.util.Set;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A067992.
 * @author Sean A. Irvine
 */
public class A067992 extends MemorySequence {

  private final HashSet<Q> mRatios = new HashSet<>();

  /**
   * Return the current set of ratios.
   * @return the ratios
   */
  public Set<Q> getRatios() {
    return mRatios;
  }

  @Override
  protected Z computeNext() {
    if (size() == 0) {
      return Z.ONE;
    }
    Z k = Z.ZERO;
    while (true) {
      k = k.add(1);
      final Z t = a(size() - 1);
      final Q v = new Q(k, t).min(new Q(t, k));
      if (mRatios.add(v)) {
        return k;
      }
    }
  }
}

