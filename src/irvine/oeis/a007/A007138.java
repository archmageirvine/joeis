package irvine.oeis.a007;

import java.util.HashSet;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007138.
 * @author Sean A. Irvine
 */
public class A007138 implements Sequence {

  private final HashSet<Z> mS = new HashSet<>();
  private Z mN = Z.ONE;

  @Override
  public Z next() {
    mN = mN.multiply(10);
    final FactorSequence fs = Jaguar.factor(mN.subtract(1));
    Z res = null;
    for (final Z p : fs.toZArray()) {
      final boolean isNew = mS.add(p);
      if (isNew && res == null) {
        res = p;
      }
    }
    return res;
  }
}
