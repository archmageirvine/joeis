package irvine.oeis.a122;

import irvine.math.polynomial.BarSymmetricGroupCycleIndex;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A122082 Number of unlabeled bicolored graphs on 2n nodes which are invariant when the two color classes are interchanged.
 * @author Sean A. Irvine
 */
public class A122082 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : BarSymmetricGroupCycleIndex.barSymmetricGroupCycleIndex(mN).apply(1).toZ();
  }
}
