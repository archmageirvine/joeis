package irvine.oeis.a079;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A079846 Powers of 3 which differ at all digits from the previous term.
 * @author Sean A. Irvine
 */
public class A079846 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else {
      final int syn = Functions.SYNDROME.i(mA);
      do {
        mA = mA.multiply(3);
      } while ((Functions.SYNDROME.i(mA) & syn) != 0);
    }
    return mA;
  }
}

