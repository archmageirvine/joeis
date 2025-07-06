package irvine.oeis.a078;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.group.GaloisField;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence2;
import irvine.oeis.a246.A246655;
import irvine.util.Permutation;

/**
 * A078600 Number of permutation polynomials over F_q of degree &lt; q-2, as q runs through the prime powers &gt;= 2.
 * @author Sean A. Irvine
 */
public class A078600 extends Sequence2 {

  // todo This is not working properly for prime powers -- probably problems with GaloisField

  private final Sequence mPrimePrimes = new A246655();

  @Override
  public Z next() {
    final Z q = mPrimePrimes.next();
    final FactorSequence fs = Jaguar.factor(q); // q = p^e
    final GaloisField fld = new GaloisField(fs.toZArray()[0], fs.maxExponent());
    final int size = fld.size().intValueExact();
    final Permutation perm = new Permutation(size);
    int[] p;
    long cnt = 0;
    while ((p = perm.next()) != null) {
      Z sum = Z.ZERO;
      for (final Z c : fld) {
        final Z sigmac = Z.valueOf(p[c.intValue()]);
        sum = fld.add(sum, fld.multiply(c, sigmac));
      }
      if (sum.isZero()) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}

