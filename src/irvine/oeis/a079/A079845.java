package irvine.oeis.a079;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079845 Powers of 2 which differ at all digits from the previous term.
 * @author Sean A. Irvine
 */
public class A079845 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else {
      final int syn = Functions.SYNDROME.i(mA);
      do {
        mA = mA.multiply2();
      } while ((Functions.SYNDROME.i(mA) & syn) != 0);
    }
    return mA;
  }
}

