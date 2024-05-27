package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069874 a(1) = a(2) = 1; a(n) = 2^a(n-1) + 2^a(n-2) for n &gt; 2.
 * @author Sean A. Irvine
 */
public class A069874 extends Sequence1 {

  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.ONE;
      } else {
        mB = Z.ONE;
      }
      return Z.ONE;
    } else {
      final Z t = Z.ONE.shiftLeft(mA.longValueExact()).add(Z.ONE.shiftLeft(mB.longValueExact()));
      mA = mB;
      mB = t;
      return t;
    }
  }
}

