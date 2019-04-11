package irvine.oeis.a005;

import irvine.math.factorial.NaiveFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005607 <code>a(n) = (a(n-1) + a(n-2))!</code>.
 * @author Sean A. Irvine
 */
public class A005607 implements Sequence {

  private final NaiveFactorial mF = new NaiveFactorial();
  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      mB = Z.ONE;
    } else if (mA == null) {
      mA = Z.ONE;
    } else {
      final Z t = mF.factorial(mA.add(mB).intValueExact());
      mA = mB;
      mB = t;
    }
    return mB;
  }
}

