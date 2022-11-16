package irvine.oeis.a038;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A038526 Concatenation of prime factors of n-th Fibonacci number.
 * @author Sean A. Irvine
 */
public class A038526 extends A000045 {

  {
    setOffset(3);
    super.next();
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    final Z f = super.next();
    final FactorSequence fs = Jaguar.factor(f);
    final StringBuilder sb = new StringBuilder();
    for (final Z p : fs.toZArray()) {
      for (int k = 0; k < fs.getExponent(p); ++k) {
        sb.append(p);
      }
    }
    return new Z(sb);
  }
}
