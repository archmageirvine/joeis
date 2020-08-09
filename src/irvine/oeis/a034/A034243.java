package irvine.oeis.a034;

import irvine.math.group.SymmetricGroup;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.WreathExponentiation;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034243 Number of quaternary codes (not necessarily linear) of length n with 6 words.
 * @author Sean A. Irvine
 */
public class A034243 implements Sequence {

  private static final CycleIndex Z4 = SymmetricGroup.create(4).cycleIndex();
  private int mN = 0;

  @Override
  public Z next() {
    return WreathExponentiation.exponentiation(Z4, SymmetricGroup.create(++mN).cycleIndex()).applyOnePlusXToTheN(6).coeff(6).toZ();
  }
}

