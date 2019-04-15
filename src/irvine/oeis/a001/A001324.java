package irvine.oeis.a001;

import irvine.math.group.CyclicGroup;
import irvine.math.group.SymmetricGroup;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.WreathExponentiation;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001324 Number of equivalence classes of n-valued Post functions of 2 variables under action of semi-direct product of symmetric group S_2 and complementing group <code>C(2,n)</code>.
 * @author Sean A. Irvine
 */
public class A001324 implements Sequence {

  private static final CycleIndex Z2 = SymmetricGroup.create(2).cycleIndex();
  private int mN = 1;

  @Override
  public Z next() {
    ++mN;
    return WreathExponentiation.exponentiation(new CyclicGroup(mN).cycleIndex(), Z2).eval(mN).toZ();
  }
}
