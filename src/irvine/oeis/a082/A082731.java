package irvine.oeis.a082;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Conjectural;
import irvine.oeis.Sequence0;
import irvine.util.array.LongDynamicLongArray;

/**
 * A082731 a(n) is the smallest number k such that A033880(k)= n, or 0 if no such number exists, where A033880 is the abundance of k.
 * @author Sean A. Irvine
 */
public class A082731 extends Sequence0 implements Conjectural {

  private static final long HEURISTIC = 50000;
  private final LongDynamicLongArray mFirsts = new LongDynamicLongArray();
  private long mN = -1;
  private long mM = 0;

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == 0 && mM <= HEURISTIC * (mN + 1)) {
      final long v = Functions.SIGMA.l(++mM) - 2 * mM;
      if (v >= 0 && mFirsts.get(v) == 0) {
        if (v < mN) {
          throw new RuntimeException("Previously reported 0 for " + v + " was incorrect, it should be " + mM);
        }
        mFirsts.set(v, mM);
      }
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}
