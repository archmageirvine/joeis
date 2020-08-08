package irvine.oeis.a034;

import irvine.math.group.SymmetricGroup;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.WreathExponentiation;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034232 Number of ternary codes (not necessarily linear) of length n with 12 words.
 * @author Sean A. Irvine
 */
public class A034232 implements Sequence {

  private static final CycleIndex Z3 = SymmetricGroup.create(3).cycleIndex();
  private int mN = 0;

  @Override
  public Z next() {
    return WreathExponentiation.exponentiation(Z3, SymmetricGroup.create(++mN).cycleIndex()).applyOnePlusXToTheN(12).coeff(12).toZ();
  }
}

