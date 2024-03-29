package irvine.oeis.a034;

import irvine.math.group.SymmetricGroup;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.Polynomial;
import irvine.math.polynomial.WreathExponentiation;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A034214 Number of ternary codes of length 2 with n words.
 * @author Sean A. Irvine
 */
public class A034214 extends Sequence0 {

  private static final CycleIndex Z3 = SymmetricGroup.create(3).cycleIndex();
  private static final CycleIndex Z2 = SymmetricGroup.create(2).cycleIndex();
  private final Polynomial<Q> mA = WreathExponentiation.exponentiation(Z3, Z2).applyOnePlusXToTheN();
  private int mN = -1;

  @Override
  public Z next() {
    return mA.coeff(++mN).toZ();
  }
}

