package irvine.oeis.a085;

import irvine.math.function.Functions;
import irvine.math.group.SymmetricGroup;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A085547 a(n) is the maximal row sum in the character table of the symmetric group S_n.
 * @author Sean A. Irvine
 */
public class A085547 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z max = Z.ZERO;
    for (final Z[] t : SymmetricGroup.create(mN).characterTable()) {
      max = max.max(Functions.SUM.z(t));
    }
    return max;
  }
}
