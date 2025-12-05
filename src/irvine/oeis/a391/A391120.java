package irvine.oeis.a391;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A391120 allocated for Robert Israel.
 * @author Sean A. Irvine
 */
public class A391120 extends Sequence1 {

  private long mN = 0;
  private long mL = 1;

  @Override
  public Z next() {
    if (++mN == mL) {
      mL *= 10;
      return Z.NEG_ONE;
    }
    long k = 0;
    Z nk = Z.ONE;
    while (true) {
      ++k;
      nk = nk.multiply(mN);
      if ((Functions.SYNDROME.i(nk) & 0b1000000000) != 0) {
        return Z.valueOf(k);
      }
    }
  }
}
