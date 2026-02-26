package irvine.oeis.a392;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A392364 allocated for Ctibor O. Zizka.
 * @author Sean A. Irvine
 */
public class A392364 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.NEG_ONE;
    }
    final Z sn = Functions.SIGMA0.z(mN);
    long k = 0;
    while (true) {
      final long sk = Functions.SIGMA0.l(++k);
      if (sn.multiply(sk).mod(sn.add(sk)).isZero()) {
        return Z.valueOf(k);
      }
    }
  }
}
