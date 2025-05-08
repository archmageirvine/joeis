package irvine.oeis.a382;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A382926 allocated for Michael De Vlieger.
 * @author Sean A. Irvine
 */
public class A382964 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    final long gpf = Functions.GPF.l(mN);
    long cnt = 0;
    for (long k = 1; k <= mN; ++k) {
      final long r = Functions.RAD.l(k);
      if (mN % r == 0 && k * gpf > mN) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}

