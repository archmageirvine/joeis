package irvine.oeis.a056;

import irvine.math.group.CyclicGroup;
import irvine.math.group.SymmetricGroup;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.WreathExponentiation;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056667 Number of equivalence classes of n-valued Post functions of 3 variables under action of semi-direct product of symmetric group S_3 and complementing group C(3,n).
 * @author Sean A. Irvine
 */
public class A056667 implements Sequence {

  private static final CycleIndex Z3 = SymmetricGroup.create(3).cycleIndex();
  private int mN = 1;

  @Override
  public Z next() {
    return WreathExponentiation.exponentiation(new CyclicGroup(++mN).cycleIndex(), Z3).eval(mN).toZ();
  }
}
