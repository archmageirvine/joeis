package irvine.oeis.a391;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A391055 allocated for Alain Rocchelli.
 * @author Sean A. Irvine
 */
public class A391055 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z m = Z.valueOf(++mN);
    long cnt = 0;
    while (!m.equals(Z.TWO)) {
      m = Functions.GPF.z(m.multiply(3).add(1));
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}
