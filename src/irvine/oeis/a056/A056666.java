package irvine.oeis.a056;

import irvine.math.group.CyclicGroup;
import irvine.math.group.SymmetricGroup;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.WreathExponentiation;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056666 Number of equivalence classes of 4-valued Post functions of n variables under action of semi-direct product of symmetric group S_n and complementing group <code>C(n,4)</code>.
 * @author Sean A. Irvine
 */
public class A056666 implements Sequence {

  private static final CycleIndex Z4 = new CyclicGroup(4).cycleIndex();
  private int mN = 0;

  @Override
  public Z next() {
    return WreathExponentiation.exponentiation(Z4, SymmetricGroup.create(++mN).cycleIndex()).eval(4).toZ();
  }
}
