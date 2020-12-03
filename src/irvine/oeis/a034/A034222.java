package irvine.oeis.a034;

import irvine.math.group.SymmetricGroup;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.Polynomial;
import irvine.math.polynomial.WreathExponentiation;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034222 Number of ternary codes of length 10 with n words.
 * @author Sean A. Irvine
 */
public class A034222 implements Sequence {

  private static final CycleIndex Z3 = SymmetricGroup.create(3).cycleIndex();
  private static final CycleIndex Z10 = SymmetricGroup.create(10).cycleIndex();
  private final Polynomial<Q> mA = WreathExponentiation.exponentiation(Z3, Z10).applyOnePlusXToTheN();
  private int mN = -1;

  @Override
  public Z next() {
    final Z r = mA.coeff(++mN).toZ();
    return r.isZero() ? null : r;
  }
}

