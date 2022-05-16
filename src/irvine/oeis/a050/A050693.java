package irvine.oeis.a050;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A050693 Composites c whose decimal expansion ends with its largest prime factor.
 * @author Sean A. Irvine
 */
public class A050693 implements Sequence {

  private long mN = 14;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.bigOmega() > 1) {
        final Z[] d = fs.toZArray();
        if (String.valueOf(mN).endsWith(d[d.length - 1].toString())) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
