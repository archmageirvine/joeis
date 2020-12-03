package irvine.oeis.a034;

import irvine.math.group.SymmetricGroup;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.Polynomial;
import irvine.math.polynomial.WreathExponentiation;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034197 Number of binary codes of length 12 with n words.
 * @author Sean A. Irvine
 */
public class A034197 implements Sequence {

  private static final CycleIndex Z2 = SymmetricGroup.create(2).cycleIndex();
  private static final CycleIndex Z12 = SymmetricGroup.create(12).cycleIndex();
  private final Polynomial<Q> mA = WreathExponentiation.exponentiation(Z2, Z12).applyOnePlusXToTheN();
  private int mN = -1;

  @Override
  public Z next() {
    final Z r = mA.coeff(++mN).toZ();
    return r.isZero() ? null : r;
  }
}

