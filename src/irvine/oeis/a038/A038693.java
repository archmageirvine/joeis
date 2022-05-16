package irvine.oeis.a038;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A038693 Numbers whose concatenation of prime factors (with multiplicity) is a square.
 * @author Sean A. Irvine
 */
public class A038693 implements Sequence {

  private long mN = 9;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      final StringBuilder sb = new StringBuilder();
      for (final Z p :fs.toZArray()) {
        for (int k = 0; k < fs.getExponent(p); ++k) {
          sb.append(p);
        }
      }
      if (new Z(sb).isSquare()) {
        return Z.valueOf(mN);
      }
    }
  }
}
