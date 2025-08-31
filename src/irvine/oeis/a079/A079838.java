package irvine.oeis.a079;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079838 a(1)=1 and for n&gt;1, a(n) is the smallest multiple of a(n-1) which has no nonzero digit in common with a(n-1).
 * @author Sean A. Irvine
 */
public class A079838 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else {
      final int syn = Functions.SYNDROME.i(mA) & ~1;
      final Z t = mA;
      do {
        mA = mA.add(t);
      } while ((Functions.SYNDROME.i(mA) & syn) != 0);
    }
    return mA;
  }
}

