package irvine.oeis.a003;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003508 a(1) = 1; for n&gt;1, a(n) = a(n-1) + 1 + sum of distinct prime factors of a(n-1) that are &lt; a(n-1).
 * @author Sean A. Irvine
 */
public class A003508 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else {
      final FactorSequence fs = Jaguar.factor(mA);
      final Z n = mA;
      mA = mA.add(1);
      for (final Z p : fs.toZArray()) {
        if (p.compareTo(n) < 0) {
          mA = mA.add(p);
        }
      }
    }
    return mA;
  }
}

