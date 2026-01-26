package irvine.oeis.a083;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A083418 Smallest positive Integer m such that m+i^2=0 mod p_i (i-th prime) for 1&lt;=i&lt;=n.
 * @author Sean A. Irvine
 */
public class A083418 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Z[] divs = new Z[mN];
    final Z[] mods = new Z[mN];
    Z p = Z.ONE;
    for (int k = 0; k < mN; ++k) {
      p = Functions.NEXT_PRIME.z(p);
      mods[k] = p;
      divs[k] = Z.valueOf(-(k + 1L) * (k + 1L)).mod(p);
    }
    return ZUtils.chineseRemainderTheorem(divs, mods);
  }
}
