package irvine.oeis.a056;

import irvine.math.group.CyclicGroup;
import irvine.math.group.SymmetricGroup;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.WreathExponentiation;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056666.
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
