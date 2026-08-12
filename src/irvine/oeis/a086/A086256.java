package irvine.oeis.a086;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A086256 Number of base-2 Fermat pseudoprimes that divide 2^n-1.
 * @author Sean A. Irvine
 */
public class A086256 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (final Z d : Jaguar.factor(Z.ONE.shiftLeft(mN).subtract(1)).divisorsSorted()) {
      if (!d.isOne() && Z.TWO.modPow(d, d).equals(Z.TWO) && !d.isProbablePrime()) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}

