package irvine.oeis.a034;

import irvine.math.group.SymmetricGroup;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.Polynomial;
import irvine.math.polynomial.WreathExponentiation;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034240 Number of quaternary codes of length 9 with n words.
 * @author Sean A. Irvine
 */
public class A034240 implements Sequence {

  private static final CycleIndex Z4 = SymmetricGroup.create(4).cycleIndex();
  private static final CycleIndex Z9 = SymmetricGroup.create(9).cycleIndex();
  private final Polynomial<Q> mA = WreathExponentiation.exponentiation(Z4, Z9).applyOnePlusXToTheN();
  private int mN = -1;

  @Override
  public Z next() {
    final Z r = mA.coeff(++mN).toZ();
    return Z.ZERO.equals(r) ? null : r;
  }
}

