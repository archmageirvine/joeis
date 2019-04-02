package irvine.oeis.a255;

import irvine.math.group.DihedralGroup;
import irvine.math.group.SymmetricGroup;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.WreathExponentiation;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A255016 Number of toroidal n X n binary arrays, allowing rotation and/or reflection of rows and/or columns as well as matrix transposition.
 * @author Sean A. Irvine
 */
public class A255016 implements Sequence {

  private static final CycleIndex Z2 = SymmetricGroup.create(2).cycleIndex();
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    return WreathExponentiation.exponentiation(DihedralGroup.cycleIndex(mN), Z2).eval(2).toZ();
  }
}
