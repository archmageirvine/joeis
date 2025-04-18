package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061913.
 * @author Sean A. Irvine
 */
public class A076848 extends Sequence1 {

  private static final Z Z13 = Z.valueOf(13);
  private static final Z GOOGOL = Z.TEN.pow(100);
  private long mN = 0;

  @Override
  public Z next() {
    Z t = GOOGOL.add(++mN).makeOdd();
    while (true) {
      final Z res = Functions.LPF.z(t);
      if (res.compareTo(Z13) > 0) {
        return res;
      }
      t = t.divide(res);
    }
  }
}
