package irvine.oeis.a391;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A391269 allocated for Alain Rocchelli.
 * @author Sean A. Irvine
 */
public class A391269 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z m = Z.valueOf(++mN);
    long cnt = 0;
    while (!m.equals(Z.THREE)) {
      m = Functions.GPF.z(m.multiply2().add(1));
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}
