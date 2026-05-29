package irvine.oeis.a085;

import java.util.Arrays;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A085079 Largest number with the prime signature of n using prime divisors of n.
 * @author Sean A. Irvine
 */
public class A085079 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    final Z[] p = fs.toZArray();
    final int[] e = new int[p.length];
    for (int k = 0; k < p.length; ++k) {
      e[k] = fs.getExponent(p[k]);
    }
    Arrays.sort(e);
    Z prod = Z.ONE;
    for (int k = 0; k < p.length; ++k) {
      prod = prod.multiply(p[k].pow(e[k]));
    }
    return prod;
  }
}

