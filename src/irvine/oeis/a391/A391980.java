package irvine.oeis.a391;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a052.A052486;

/**
 * A391980 Achilles numbers divisible by at least 2 cubes greater than 1.
 * @author Sean A. Irvine
 */
public class A391980 extends Sequence1 {

  private final Sequence mA = new A052486();

  @Override
  public Z next() {
    while (true) {
      final Z t = mA.next();
      final FactorSequence fs = Jaguar.factor(t);
      int cnt = 0;
      for (final Z p : fs.toZArray()) {
        if (fs.getExponent(p) >= 3 && ++cnt > 1) {
          return t;
        }
      }
    }
  }
}
