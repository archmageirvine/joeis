package irvine.oeis.a049;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A049121 If a(n) is prime, a(n+1) = a(n) followed by a 1; if a(n) is composite, a(n+1) = concatenation of prime factors of a(n) (with multiplicity).
 * @author Sean A. Irvine
 */
public class A049121 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ZERO;
    } else if (Z.ZERO.equals(mA) || Z.ONE.equals(mA) || mA.isProbablePrime()) {
      mA = mA.multiply(10).add(1);
    } else {
      final FactorSequence fs = Jaguar.factor(mA);
      final StringBuilder sb = new StringBuilder();
      for (final Z p : fs.toZArray()) {
        final int e = fs.getExponent(p);
        for (int k = 0; k < e; ++k) {
          sb.append(p);
        }
      }
      mA = new Z(sb);
    }
    return mA;
  }
}

