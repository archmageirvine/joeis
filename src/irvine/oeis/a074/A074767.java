package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A074767.
 * @author Sean A. Irvine
 */
public class A074767 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    final long gpf = Functions.GPF.l(++mN);
    long k = (mN / gpf) * gpf;
    while (true) {
      k += gpf;
      if (Functions.LPF.l(k) == gpf) {
        return Z.valueOf(k);
      }
    }
  }
}
