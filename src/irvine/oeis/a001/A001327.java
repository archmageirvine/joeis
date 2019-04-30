package irvine.oeis.a001;

import irvine.math.group.SymmetricGroup;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.WreathExponentiation;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001327 Number of equivalence classes of 3-valued Post functions of n variables under action of semi-direct product of symmetric groups S_n and <code>S(n,3)</code>.
 * @author Sean A. Irvine
 */
public class A001327 implements Sequence {

  private static final CycleIndex Z3 = SymmetricGroup.create(3).cycleIndex();
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return WreathExponentiation.exponentiation(Z3, SymmetricGroup.create(mN).cycleIndex()).eval(3).toZ();
  }
}
