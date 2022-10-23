package irvine.oeis.a000;

import irvine.math.group.GaloisField;
import irvine.math.group.GeneralLinearGroup;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A000585 Number of equivalence classes of Boolean functions of n variables under GL(n,2).
 * @author Sean A. Irvine
 */
public class A000585 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    return new GeneralLinearGroup<>(++mN, new GaloisField(2)).cycleIndex().apply(1).toZ();
  }
}
