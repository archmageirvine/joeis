package irvine.oeis.a085;

import java.util.HashSet;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A085946 a(1) = 1, a(2) = 2 and a(n) = smallest number not included earlier that divides the concatenation a(n-2), a(n-1).
 * @author Sean A. Irvine
 */
public class A085946 extends Sequence1 {

  private final HashSet<Z> mUsed = new HashSet<>();
  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mUsed.add(Z.ONE);
        mA = Z.ONE;
        return Z.ONE;
      }
      mUsed.add(Z.TWO);
      mB = Z.TWO;
      return Z.TWO;
    }
    final Z t = new Z(mA.toString() + mB);
    for (final Z d : Jaguar.factor(t).divisorsSorted()) {
      if (mUsed.add(d)) {
        mA = mB;
        mB = d;
        return d;
      }
    }
    return null; // this would mean the sequence is finite
  }
}
