package irvine.oeis.a034;

import irvine.math.group.SymmetricGroup;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.WreathExponentiation;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A034242 Number of quaternary codes (not necessarily linear) of length n with 5 words.
 * @author Sean A. Irvine
 */
public class A034242 extends Sequence1 {

  private static final CycleIndex Z4 = SymmetricGroup.create(4).cycleIndex();
  private int mN = 0;

  @Override
  public Z next() {
    return WreathExponentiation.exponentiation(Z4, SymmetricGroup.create(++mN).cycleIndex()).applyOnePlusXToTheN(5).coeff(5).toZ();
  }
}

