package irvine.oeis.a082;

import irvine.math.function.Functions;
import irvine.math.group.SymmetricGroup;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082733 Sum of all entries in character table of the symmetric group S_n.
 * @author Sean A. Irvine
 */
public class A082733 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (final Z[] t : SymmetricGroup.create(mN).characterTable()) {
      sum = sum.add(Functions.SUM.z(t));
    }
    return sum;
  }
}
