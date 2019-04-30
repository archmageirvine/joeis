package irvine.oeis.a001;

import irvine.math.group.SymmetricGroup;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.WreathExponentiation;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001328 Number of equivalence classes of n-valued Post functions of 2 variables under action of semi-direct product of symmetric groups S_2 and <code>S(2,n)</code>.
 * @author Sean A. Irvine
 */
public class A001328 implements Sequence {

  private static final CycleIndex Z2 = SymmetricGroup.create(2).cycleIndex();
  private int mN = 1;

  @Override
  public Z next() {
    return WreathExponentiation.exponentiation(SymmetricGroup.create(++mN).cycleIndex(), Z2).eval(mN).toZ();
  }
}
