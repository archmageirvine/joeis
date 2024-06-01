package irvine.oeis.a070;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicLongArray;

/**
 * A070016 Least m such that Chowla's function value of m [A048050(m)] equals n or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A070016 extends Sequence1 {

  private long mN = 0;
  private long mM = 1;
  private final LongDynamicLongArray mFirsts = new LongDynamicLongArray();

  @Override
  public Z next() {
    ++mN;
    while (mM <= mN * mN) {
      final long chowla = Functions.CHOWLA.l(mM);
      if (chowla >= 0 && mFirsts.get(chowla) == 0) {
        mFirsts.set(chowla, mM);
      }
      ++mM;
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}

