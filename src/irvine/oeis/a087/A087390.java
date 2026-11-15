package irvine.oeis.a087;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A087390 a(1) = 7; a(n+1) is the least prime formed by adding one or more digits to the digit reversal of a(n).
 * @author Sean A. Irvine
 */
public class A087390 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.SEVEN;
      return Z.SEVEN;
    }
    mA = Functions.REVERSE.z(mA).multiply(10);
    long lim = 10;
    long k = -1;
    while (true) {
      k += 2;
      if (k >= lim) {
        mA = mA.multiply(10);
        lim *= 10;
        k = 1;
      }
      final Z t = mA.add(k);
      if (t.isProbablePrime()) {
        mA = t;
        return t;
      }
    }
  }
}

