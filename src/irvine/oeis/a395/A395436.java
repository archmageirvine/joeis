package irvine.oeis.a395;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.partition.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A395436 allocated for Andrea Cutri.
 * @author Sean A. Irvine
 */
public class A395436 extends Sequence1 {

  private int mN = 0;

  private Z palindromeTotal(final int m) {
    final IntegerPartition part = new IntegerPartition(m);
    final Z numer = Functions.FACTORIAL.z((m - 1) / 2);
    Z sum = Z.ZERO;
    int[] p;
    while ((p = part.next()) != null) {
      int odd = 0;
      Z den = Z.ONE;
      for (final int v : p) {
        if ((v & 1) == 1) {
          ++odd;
        }
        den = den.multiply(Functions.FACTORIAL.z(v / 2));
      }
      if (odd == 1) {
        sum = sum.add(numer.divide(den));
      }
    }
    return sum;
  }

  @Override
  public Z next() {
    ++mN;
    final int len = 2 * mN + 1;
    Z sum = Z.ZERO;
    final FactorSequence fs = Jaguar.factor(len);
    for (final Z dz : fs.divisors()) {
      final int d = dz.intValueExact();
      final int m = Functions.MOBIUS.i(len / d);
      if (m != 0) {
        final Z t = palindromeTotal(d);
        sum = sum.signedAdd(m == 1, t);
      }
    }
    return sum;
  }
}
