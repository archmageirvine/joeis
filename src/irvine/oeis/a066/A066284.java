package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066284 a(n) = A066135(4*n).
 * @author Sean A. Irvine
 */
public class A066284 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    mN += 4;
    long k = 4;
    while (true) {
      k += 2;
      if (Jaguar.factor(k).sigma(mN).mod(k) == 0) {
        return Z.valueOf(k);
      }
    }
  }
}
