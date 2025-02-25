package irvine.oeis.a075;

import java.util.HashSet;
import java.util.Set;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075373 a(1)=0, a(2)=9; then distinct squares such that the sum of three successive terms is a square.
 * @author Sean A. Irvine
 */
public class A075373 extends Sequence1 {

  // After Andrew Howroyd

  private final Set<Z> mUsed = new HashSet<>();
  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.ZERO;
        mUsed.add(Z.ONE);
        return Z.ZERO;
      }
      mB = Z.NINE;
      mUsed.add(Z.THREE);
      return mB;
    }
    final Z s = mA.add(mB);
    for (final Z d : Jaguar.factor(s).divisorsSorted()) {
      final Z t = d.subtract(s.divide(d));
      if (t.signum() > 0 && t.isEven()) {
        final Z t2 = t.divide2();
        if (mUsed.add(t2)) {
          final Z sq = t2.square();
          mA = mB;
          mB = sq;
          return sq;
        }
      }
    }
    throw new RuntimeException();
  }
}
