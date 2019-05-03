package irvine.oeis.a255;

import irvine.math.group.CyclicGroup;
import irvine.math.group.SymmetricGroup;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.WreathExponentiation;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A255015 Number of toroidal <code>n X n</code> binary arrays, allowing rotation of rows and/or columns as well as matrix transposition.
 * @author Sean A. Irvine
 */
public class A255015 implements Sequence {

  private static final CycleIndex Z2 = SymmetricGroup.create(2).cycleIndex();
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    return WreathExponentiation.exponentiation(new CyclicGroup(mN).cycleIndex(), Z2).eval(2).toZ();
  }
}
