package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Conjectural;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicLongArray;

/**
 * A076366 Number of numbers for which the count of nonprimes (i.e., 1 and composites) in their reduced residue set equals n.
 * @author Sean A. Irvine
 */
public class A076366 extends Sequence1 implements Conjectural {

  private final LongDynamicLongArray mCounts = new LongDynamicLongArray();
  private long mM = 0;
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    while (mM < 100 || 10 * mN * mN >= mM) {
      ++mM;
      final long t = Functions.PHI.l(mM) - Functions.PRIME_PI.l(mM) + Functions.OMEGA.l(mM);
      if (t < mN) {
        throw new RuntimeException("Previously reported value for n=" + t + " was too small");
      }
      mCounts.increment(t);
    }
    return Z.valueOf(mCounts.get(mN));
  }
}
