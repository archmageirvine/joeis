package irvine.oeis.a003;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003508 <code>a(1) = 1;</code> for <code>n&gt;1, a(n) = a(n-1) + 1 +</code> sum of distinct prime factors of <code>a(n-1)</code> that are <code>&lt; a(n-1)</code>.
 * @author Sean A. Irvine
 */
public class A003508 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else {
      final FactorSequence fs = Cheetah.factor(mA);
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

