package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.LongDynamicLongArray;

/**
 * A076551 Smallest triangular number with n prime factors (counted without multiplicity).
 * @author Sean A. Irvine
 */
public class A076551 extends Sequence0 {

  private final LongDynamicLongArray mFirsts = new LongDynamicLongArray();
  private long mN = -1;
  private long mM = 0;

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == 0) {
      final long s = (++mM & 1) == 0
        ? Functions.OMEGA.l(mM / 2) + Functions.OMEGA.l(mM + 1)
        : Functions.OMEGA.l(mM) + Functions.OMEGA.l((mM + 1) / 2);
      if (mFirsts.get(s) == 0) {
        mFirsts.set(s, mM);
      }
    }
    return Functions.TRIANGULAR.z(mFirsts.get(mN));
  }
}
