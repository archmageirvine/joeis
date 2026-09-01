package irvine.oeis.a088;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence2;

/**
 * A088196 Largest number that is not a quadratic residue modulo prime(n).
 * @author Sean A. Irvine
 */
public class A088196 extends Sequence2 {

  private Z mP = Z.TWO;

  @Override
  public Z next() {
    mP = Functions.NEXT_PRIME.z(mP);
    Z r = mP;
    while (true) {
      r = r.subtract(1);
      if (!ZUtils.isQuadraticResidue(r, mP)) {
        return r;
      }
    }
  }
}

