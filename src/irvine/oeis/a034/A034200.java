package irvine.oeis.a034;

import irvine.math.group.SymmetricGroup;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.WreathExponentiation;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034200 Number of binary codes (not necessarily linear) of length n with 5 words.
 * @author Sean A. Irvine
 */
public class A034200 implements Sequence {

  private static final CycleIndex Z2 = SymmetricGroup.create(2).cycleIndex();
  private int mN = 0;

  @Override
  public Z next() {
    return WreathExponentiation.exponentiation(Z2, SymmetricGroup.create(++mN).cycleIndex()).applyOnePlusXToTheN(5).coeff(5).toZ();
  }
}

