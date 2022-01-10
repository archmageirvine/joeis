package irvine.oeis.a000;

import irvine.math.group.GaloisField;
import irvine.math.group.GeneralLinearGroup;
import irvine.math.polynomial.CycleIndex;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000832 Number of switching networks (see Harrison reference for precise definition).
 * @author Sean A. Irvine
 */
public class A000832 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    final int n = ++mN;
    final CycleIndex ans = new GeneralLinearGroup<>(n, new GaloisField(2)).cycleIndex();
    return ans.apply(2).add(ans.apply(1, 2)).divide(2).toZ();
  }
}
