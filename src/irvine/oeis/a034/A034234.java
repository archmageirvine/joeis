package irvine.oeis.a034;

import irvine.math.group.SymmetricGroup;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.Polynomial;
import irvine.math.polynomial.WreathExponentiation;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034234 Number of quaternary codes of length 3 with n words.
 * @author Sean A. Irvine
 */
public class A034234 implements Sequence {

  private static final CycleIndex Z4 = SymmetricGroup.create(4).cycleIndex();
  private static final CycleIndex Z3 = SymmetricGroup.create(3).cycleIndex();
  private final Polynomial<Q> mA = WreathExponentiation.exponentiation(Z4, Z3).applyOnePlusXToTheN();
  private int mN = -1;

  @Override
  public Z next() {
    final Z r = mA.coeff(++mN).toZ();
    return r.isZero() ? null : r;
  }
}

