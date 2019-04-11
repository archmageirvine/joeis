package irvine.oeis.a000;

import irvine.math.group.SymmetricGroup;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.WreathExponentiation;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000616 <code>a(-1)=1</code> by convention; for <code>n &gt;= 0, a(n) =</code> number of irreducible Boolean functions of n variables.
 * @author Sean A. Irvine
 */
public class A000616 implements Sequence {

  private static final CycleIndex Z2 = SymmetricGroup.create(2).cycleIndex();
  private int mN = -2;

  @Override
  public Z next() {
    if (++mN < 1) {
      if (mN == -1) {
        return Z.ONE;
      }
      return Z.TWO;
    }
    return WreathExponentiation.exponentiation(Z2, SymmetricGroup.create(mN).cycleIndex()).apply(1).toZ();
  }
}
