package irvine.oeis.a000;

import irvine.math.group.GeneralLinearCycleIndex;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000817 Number of switching networks under action of GL_n(Z_2).
 * @author Sean A. Irvine
 */
public class A000817 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    return GeneralLinearCycleIndex.cycleIndex(++mN).apply(2).toZ();
  }

}

