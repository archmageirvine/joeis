package irvine.oeis.a068;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068998 Numbers n such that the concatenation of the prime factors of n (in increasing order) is prime.
 * @author Sean A. Irvine
 */
public class A068998 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      final StringBuilder sb = new StringBuilder();
      for (final Z p : fs.toZArray()) {
        sb.append(p);
      }
      final Z t = new Z(sb);
      if (t.isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
