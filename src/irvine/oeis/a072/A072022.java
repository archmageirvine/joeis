package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Conjectural;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicLongArray;

/**
 * A072022 Smallest x such that the number of nonprimes (i.e., 1 and composites) in the reduced residue set (RSS(x)) of x equals n, or 0 if there are no such x.
 * @author Sean A. Irvine
 */
public class A072022 extends Sequence1 implements Conjectural {

  private final LongDynamicLongArray mFirsts = new LongDynamicLongArray();
  private long mM = 0;
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == 0 && 2 * mN * mN >= mM) {
      ++mM;
      final long t = Functions.PHI.l(mM) - Functions.PRIME_PI.l(mM) + Functions.OMEGA.l(mM);
      if (mFirsts.get(t) == 0) {
        mFirsts.set(t, mM);
      }
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}
