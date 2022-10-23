package irvine.oeis.a049;

import irvine.math.group.GaloisField;
import irvine.math.group.GeneralLinearGroup;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A049869 Number of equivalence classes of 3-valued Post functions of n variables under action of group GL(n,3).
 * @author Sean A. Irvine
 */
public class A049869 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    return new GeneralLinearGroup<>(mN, new GaloisField(3)).cycleIndex().eval(3).toZ();
  }
}
