package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008238 <code>a(n) = floor(n/4)*ceiling(n/4)</code>.
 * @author Sean A. Irvine
 */
public class A008238 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN / 4).multiply((mN + 3) / 4);
  }
}

