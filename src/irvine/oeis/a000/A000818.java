package irvine.oeis.a000;

import irvine.math.group.GaloisField;
import irvine.math.group.GeneralLinearGroup;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A000818 Number of switching networks under action of GL_n(Z_2).
 * @author Sean A. Irvine
 */
public class A000818 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    return new GeneralLinearGroup<>(++mN, new GaloisField(2)).cycleIndex().apply(3).toZ();
  }

}

