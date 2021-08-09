package irvine.oeis.a038;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A038524 Numbers k such that the k-th Fibonacci number is composite and the concatenation of its prime factors (written in base 10 in ascending order) is prime.
 * @author Sean A. Irvine
 */
public class A038524 extends A000045 {

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
      if (!f.isProbablePrime()) {
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
