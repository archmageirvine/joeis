package irvine.oeis.a001;

import irvine.math.group.CyclicGroup;
import irvine.math.group.SymmetricGroup;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.WreathExponentiation;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001323 Number of equivalence classes of 3-valued Post functions of n variables under action of semi-direct product of symmetric group S_n and complementing group C(n,3).
 * @author Sean A. Irvine
 */
public class A001323 implements Sequence {

  private static final CycleIndex Z3 = new CyclicGroup(3).cycleIndex();
  private int mN = 0;

  @Override
  public Z next() {
    return WreathExponentiation.exponentiation(Z3, SymmetricGroup.create(++mN).cycleIndex()).eval(3).toZ();
  }
}
