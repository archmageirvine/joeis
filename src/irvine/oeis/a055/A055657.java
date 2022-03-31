package irvine.oeis.a055;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A055657 If a(n) is prime, a(n+1) = a(n) followed by a 1; if a(n) is composite, a(n+1) = concatenation of distinct prime factors of a(n).
 * @author Sean A. Irvine
 */
public class A055657 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ZERO;
    } else if (mA.isZero()) {
      mA = Z.ONE;
    } else if (mA.isProbablePrime() || Z.ONE.equals(mA)) {
      mA = mA.multiply(10).add(1);
    } else {
      final StringBuilder sb = new StringBuilder();
      for (final Z p : Jaguar.factor(mA).toZArray()) {
        sb.append(p);
      }
      mA = new Z(sb);
    }
    return mA;
  }
}

