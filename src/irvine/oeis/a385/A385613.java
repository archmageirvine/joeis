package irvine.oeis.a385;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A385613 allocated for Ya-Ping Lu.
 * @author Sean A. Irvine
 */
public class A385613 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    Z m = Z.valueOf(++mN);
    long cnt = 0;
    final HashSet<Z> seen = new HashSet<>();
    while (!m.isZero()) {
      ++cnt;
      if (m.isEven()) {
        m = m.divide(3);
      } else if (m.isProbablePrime()) {
        m = m.square().subtract(1);
      } else {
        m = m.subtract(1);
      }
      if (!seen.add(m)) {
        return Z.NEG_ONE;
      }
    }
    return Z.valueOf(cnt);
  }
}
