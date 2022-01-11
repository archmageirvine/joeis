package irvine.oeis.a049;

import irvine.math.group.GaloisField;
import irvine.math.group.GeneralLinearGroup;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A049869.
 * @author Sean A. Irvine
 */
public class A049869 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    return new GeneralLinearGroup<>(mN, new GaloisField(3)).cycleIndex().eval(3).toZ();
  }
}
