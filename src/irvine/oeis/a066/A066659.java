package irvine.oeis.a066;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066659 Least k &gt; n such that phi(k) = phi(n), if such k exists; = 0 otherwise.
 * @author Sean A. Irvine
 */
public class A066659 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z t = Euler.inversePhi(Euler.phi(++mN)).ceiling(Z.valueOf(mN + 1));
    return t == null ? Z.ZERO : t;
  }
}
