package irvine.oeis.a394;

import java.util.HashMap;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a055.A055932;

/**
 * A394753 allocated for Michael De Vlieger.
 * @author Sean A. Irvine
 */
public class A394753 extends A055932 {

  private long mN = 0;
  private long mA = super.next().longValueExact();
  private final HashMap<Long, Long> mRadCount = new HashMap<>();

  @Override
  public Z next() {
    do {
      final long r = Functions.RAD.l(++mN);
      mRadCount.merge(r, 1L, Long::sum);
    } while (mN != mA);
    mA = super.next().longValueExact();
    Z cnt = Z.ZERO;
    for (final Z d : Jaguar.factor(mN).divisors()) {
      cnt = cnt.add(mRadCount.getOrDefault(d.longValue(), 0L));
    }
    return cnt;
  }
}
