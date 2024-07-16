package irvine.oeis.a071;

import irvine.math.z.InverseEuler;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;
import irvine.util.array.DynamicLongArray;

/**
 * A071389 Least number m such that cardinality of InvPhi[m] = prime(n).
 * @author Sean A. Irvine
 */
public class A071389 extends A000040 {

  private final DynamicLongArray mFirsts = new DynamicLongArray();
  private long mM = 0;

  @Override
  public Z next() {
    final int p = super.next().intValueExact();
    while (mFirsts.get(p) == 0) {
      final int s = InverseEuler.inversePhi(Z.valueOf(++mM)).size();
      if (mFirsts.get(s) == 0) {
        mFirsts.set(s, mM);
      }
    }
    return Z.valueOf(mFirsts.get(p));
  }
}
