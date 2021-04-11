package irvine.oeis.a014;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A014120 Smallest number of persistence n over product-of-nonzero-digits function.
 * @author Sean A. Irvine
 */
public class A014120 implements Sequence {

  private static final long[] SMALL_CASES = {0, 10, 25, 39, 77, 679};
  private int mN = -1;

  // This code assumes this sequence is increasing
  // Stores numbers of form 2*3*4*5*6*7*8*9*
  private final TreeSet<Z> mCandidates = new TreeSet<>();
  {
    for (long k = 2; k < 10; ++k) {
      mCandidates.add(Z.valueOf(k));
    }
  }

  @Override
  public Z next() {
    if (++mN < SMALL_CASES.length) {
      return Z.valueOf(SMALL_CASES[mN]);
    }
    while (true) {
      final Z c = mCandidates.pollFirst();
      if (ZUtils.multiplicativePersistence(c) == mN) {
        return c;
      }
      final Z c10 = c.multiply(10);
      for (long k = c.mod(10); k < 10; ++k) {
        mCandidates.add(c10.add(k));
      }
    }
  }
}
