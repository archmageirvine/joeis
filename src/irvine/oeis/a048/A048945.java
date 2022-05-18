package irvine.oeis.a048;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A048945 Numbers whose product of divisors is a fourth power.
 * @author Sean A. Irvine
 */
public class A048945 implements Sequence {

  // After Charles R Greathouse IV

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      long gcd = 0;
      long prod = 1;
      for (final Z p : fs.toZArray()) {
        final int e = fs.getExponent(p) & 7;
        gcd = gcd == 0 ? e : LongUtils.gcd(gcd, e) & 7;
        prod *= e + 1;
        prod &= 7;
      }
      if (((prod * gcd) & 7) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

