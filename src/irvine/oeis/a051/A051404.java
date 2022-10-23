package irvine.oeis.a051;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A051404 Neither 4 nor 9 divides C(2n-1,n) (almost certainly finite).
 * @author Sean A. Irvine
 */
public class A051404 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z t = Binomial.binomial(2 * ++mN - 1, mN);
      if (t.mod(4) != 0 && t.mod(9) != 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
