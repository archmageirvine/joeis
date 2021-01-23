package irvine.oeis.a046;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046411 Composite numbers the concatenation of whose prime factors is a prime.
 * @author Sean A. Irvine
 */
public class A046411 implements Sequence {

  private long mN = 5;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Cheetah.factor(++mN);
      if (fs.bigOmega() > 1) {
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
