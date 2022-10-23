package irvine.oeis.a000;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A000379 Numbers n where total number of 1-bits in the exponents of their prime factorization is even; a 2-way classification of integers: complement of A000028.
 * @author Sean A. Irvine
 */
public class A000379 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      long exp = 0;
      for (final Z d : fs.toZArray()) {
        exp += Integer.bitCount(fs.getExponent(d));
      }
      if ((exp & 1) == 0) {
        return Z.valueOf(mN);
      }
    }
  }

}

