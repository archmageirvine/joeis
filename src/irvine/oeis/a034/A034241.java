package irvine.oeis.a034;

import irvine.math.group.SymmetricGroup;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.WreathExponentiation;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A034241 Number of quaternary codes (not necessarily linear) of length n with 4 words.
 * @author Sean A. Irvine
 */
public class A034241 extends Sequence1 {

  private static final CycleIndex Z4 = SymmetricGroup.create(4).cycleIndex();
  private int mN = 0;

  @Override
  public Z next() {
    return WreathExponentiation.exponentiation(Z4, SymmetricGroup.create(++mN).cycleIndex()).applyOnePlusXToTheN(4).coeff(4).toZ();
  }
}

