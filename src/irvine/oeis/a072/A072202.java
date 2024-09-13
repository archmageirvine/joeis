package irvine.oeis.a072;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072202 Same numbers of prime factors of forms 4*k+1 and 4*k+3, counted with multiplicity.
 * @author Sean A. Irvine
 */
public class A072202 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      long balance = 0;
      for (final Z p : fs.toZArray()) {
        final Z t = p.and(Z.THREE);
        if (t.equals(Z.ONE)) {
          balance += fs.getExponent(p);
        } else if (t.equals(Z.THREE)) {
          balance -= fs.getExponent(p);
        }
      }
      if (balance == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
