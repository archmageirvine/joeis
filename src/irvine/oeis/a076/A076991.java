package irvine.oeis.a076;

import java.util.HashSet;
import java.util.Set;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076991 a(1) = 1, a(2) = 2, a(n) = smallest positive integer not occurring earlier such that the sum of three successive terms is a square.
 * @author Sean A. Irvine
 */
public class A076991 extends Sequence1 {

  private final Set<Z> mUsed = new HashSet<>();
  private Z mA = null;
  private Z mB = null;
  private Z mS = Z.THREE;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.ONE;
        mUsed.add(Z.ONE);
        return Z.ONE;
      }
      mB = Z.TWO;
      mUsed.add(Z.TWO);
      return mB;
    }
    final Z t = mA.add(mB);
    Z k = mS;
    while (true) {
      if (Predicates.SQUARE.is(t.add(k)) && mUsed.add(k)) {
        mA = mB;
        mB = k;
        while (mUsed.remove(mS)) {
          mS = mS.add(1);
        }
        return k;
      }
      k = k.add(1);
    }
  }
}
