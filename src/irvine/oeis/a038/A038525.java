package irvine.oeis.a038;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A038525 Numbers n with property that either the n-th Fibonacci number is prime or the concatenation of its prime factors is prime.
 * @author Sean A. Irvine
 */
public class A038525 extends A000045 {

  private long mN = 2;
  {
    super.next();
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z f = super.next();
      if (f.isProbablePrime()) {
        return Z.valueOf(mN);
      } else {
        final FactorSequence fs = Jaguar.factor(f);
        final StringBuilder sb = new StringBuilder();
        for (final Z p : fs.toZArray()) {
          for (int k = 0; k < fs.getExponent(p); ++k) {
            sb.append(p);
          }
        }
        if (new Z(sb).isProbablePrime()) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
