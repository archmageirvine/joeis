package irvine.oeis.a034;

import irvine.math.group.SymmetricGroup;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.WreathExponentiation;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034226.
 * @author Sean A. Irvine
 */
public class A034226 implements Sequence {

  private static final CycleIndex Z3 = SymmetricGroup.create(3).cycleIndex();
  private int mN = 0;

  @Override
  public Z next() {
    return WreathExponentiation.exponentiation(Z3, SymmetricGroup.create(++mN).cycleIndex()).applyOnePlusXToTheN(6).coeff(6).toZ();
  }
}

