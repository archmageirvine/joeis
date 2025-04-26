package irvine.oeis.a077;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077003 a(n) = index of triangular number A077002(n).
 * @author Sean A. Irvine
 */
public class A077003 extends Sequence1 {

  private long mN = 0;
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
      return Z.ONE;
    } else {
      final Z index = Functions.TRINV.z(mA.multiply(++mN));
      mA = Functions.TRIANGULAR.z(index);
      return index;
    }
  }
}

