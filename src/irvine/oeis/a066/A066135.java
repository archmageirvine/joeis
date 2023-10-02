package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066135 a(n) = least number m &gt; 1 such that sigma_n(m) = k*m for some k.
 * @author Sean A. Irvine
 */
public class A066135 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = 4;
    while (true) {
      k += 2;
      if (Jaguar.factor(k).sigma(mN).mod(k) == 0) {
        return Z.valueOf(k);
      }
    }
  }
}
