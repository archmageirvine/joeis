package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008130.
 * @author Sean A. Irvine
 */
public class A008130 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN / 3).multiply((mN + 2) / 3);
  }
}

