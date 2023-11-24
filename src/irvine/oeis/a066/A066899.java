package irvine.oeis.a066;

import java.util.Set;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066899 a(n) = card({k : phi(k) == n (mod k)}).
 * @author Sean A. Irvine
 */
public class A066899 extends Sequence1 {

  // After Michel Marcus

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    long cnt = 0;
    final Set<Z> inv = Euler.inversePhi(mN);
    final Z m = inv.isEmpty() ? mN : Euler.inversePhi(mN).last();
    for (Z k = Z.TWO; k.compareTo(m) <= 0; k = k.add(1)) {
      if (Euler.phi(k).equals(mN.mod(k))) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
