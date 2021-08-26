package irvine.math.cr;

import java.util.ArrayList;

import irvine.math.MemoryFunction;
import irvine.math.q.HarmonicSequence;
import irvine.math.q.Q;

/**
 * Compute the digamma (psi) function.
 * @author Sean A. Irvine
 */
public final class Psi extends MemoryFunction<Integer, CR> {

  private Psi() { }

  private static final Psi SINGLETON = new Psi();

  private final ArrayList<Q> mH = new ArrayList<>();
  private final HarmonicSequence mHarmonicSequence = new HarmonicSequence();

  private Q h(final int n) {
    while (n >= mH.size()) {
      mH.add(mHarmonicSequence.nextQ());
    }
    return mH.get(n);
  }

  @Override
  protected CR compute(final Integer n) {
    if (n == 1) {
      return CR.GAMMA.negate();
    }
    return CR.valueOf(h(n - 2)).subtract(CR.GAMMA);
  }

  /**
   * Compute the psi function at an integer.
   * @param n integer
   * @return psi
   */
  static CR psi(final int n) {
    if (n <= 0) {
      throw new IllegalArgumentException();
    }
    return SINGLETON.getValue(n);
  }

}
