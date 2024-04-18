package irvine.oeis.a015;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicLongArray;

/**
 * A015126 Least k such that phi(k) = phi(n).
 * @author Sean A. Irvine
 */
public class A015126 extends Sequence1 {

  private final LongDynamicLongArray mLeast = new LongDynamicLongArray();
  private long mN = 0;

  @Override
  public Z next() {
    final long n = ++mN;
    final long phi = Functions.PHI.l(n);
    if (mLeast.get(phi) == 0) {
      mLeast.set(phi, mN);
    }
    return Z.valueOf(mLeast.get(phi));
  }
}
