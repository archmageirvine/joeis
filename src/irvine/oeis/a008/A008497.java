package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008497 <code>a(n) = floor(n/5)*floor((n+1)/5)</code>.
 * @author Sean A. Irvine
 */
public class A008497 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN / 5).multiply((mN + 1) / 5);
  }
}
