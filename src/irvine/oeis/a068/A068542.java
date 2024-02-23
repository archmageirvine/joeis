package irvine.oeis.a068;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A051043.
 * @author Sean A. Irvine
 */
public class A068542 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z t = Z.THREE.pow(++mN);
    return new Q(Z.TEN.pow(Z.THREE.pow(Long.max(mN - 2, 0)).add(CR.valueOf(t).log10().floor())), t).toZ();
  }
}
