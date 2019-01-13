package irvine.oeis.a007;

import irvine.math.group.SymmetricGroup;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.WreathExponentiation;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007139.
 * @author Sean A. Irvine
 */
public class A007139 implements Sequence {

  private static final CycleIndex Z2 = SymmetricGroup.create(2).cycleIndex();
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    // Compute Z([S_n]^{S_2})
    return WreathExponentiation.exponentiation(SymmetricGroup.create(mN).cycleIndex(), Z2).eval(2).toZ();
  }
}
