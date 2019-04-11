package irvine.oeis.a007;

import irvine.math.group.SymmetricGroup;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.WreathExponentiation;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007139 Number of unlabeled bicolored bipartite graphs on <code>2n</code> nodes having n nodes of each color with no edges between vertices of the same color and allowing the color classes to be interchanged.
 * @author Sean A. Irvine
 */
public class A007139 implements Sequence {

  private static final CycleIndex Z2 = SymmetricGroup.create(2).cycleIndex();
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    // Compute Z([S_n]^{S_2})
    return WreathExponentiation.exponentiation(SymmetricGroup.create(mN).cycleIndex(), Z2).eval(2).toZ();
  }
}
