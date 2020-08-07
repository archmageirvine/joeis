package irvine.oeis.a034;

import irvine.math.group.SymmetricGroup;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.Polynomial;
import irvine.math.polynomial.WreathExponentiation;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034192.
 * @author Sean A. Irvine
 */
public class A034192 implements Sequence {

  private static final CycleIndex Z2 = SymmetricGroup.create(2).cycleIndex();
  private static final CycleIndex Z7 = SymmetricGroup.create(7).cycleIndex();
  private final Polynomial<Q> mA = WreathExponentiation.exponentiation(Z2, Z7).applyOnePlusXToTheN();
  private int mN = -1;
  
  @Override
  public Z next() {
    return mA.coeff(++mN).toZ();
  }
}

