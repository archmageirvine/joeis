package irvine.oeis.a061;

import java.util.Arrays;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061665 Numbers n whose digits in their prime factorization are the same as those of the prime factorization of n+1.
 * @author Sean A. Irvine
 */
public class A061665 extends Sequence1 {

  private long mN = 8762;

  private int[] getCounts(final long n) {
    final int[] cnts = new int[10];
    final FactorSequence fs = Jaguar.factor(n);
    for (Z p : fs.toZArray()) {
      final int e = fs.getExponent(p);
      while (!p.isZero()) {
        final Z[] qr = p.divideAndRemainder(Z.TEN);
        cnts[qr[1].intValue()] += e;
        p = qr[0];
      }
    }
    return cnts;
  }

  @Override
  public Z next() {
    while (true) {
      if (Arrays.equals(getCounts(++mN), getCounts(mN + 1))) {
        return Z.valueOf(mN);
      }
    }
  }
}

