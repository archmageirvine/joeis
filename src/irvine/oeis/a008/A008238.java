package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008238.
 * @author Sean A. Irvine
 */
public class A008238 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN / 4).multiply((mN + 3) / 4);
  }
}

