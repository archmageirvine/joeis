package irvine.oeis.a049;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A049201 If n is not composite, a(n) = n followed by 1; if n is composite, a(n) = concatenation of prime factors of n.
 * @author Sean A. Irvine
 */
public class A049201 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    if (mN.compareTo(Z.ONE) <= 0 || mN.isProbablePrime()) {
      return mN.multiply(10).add(1);
    } else {
      final FactorSequence fs = Jaguar.factor(mN);
      final StringBuilder sb = new StringBuilder();
      for (final Z p : fs.toZArray()) {
        final int e = fs.getExponent(p);
        for (int k = 0; k < e; ++k) {
          sb.append(p);
        }
      }
      return new Z(sb);
    }
  }
}

