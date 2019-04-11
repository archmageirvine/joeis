package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008233 <code>a(n) = floor(n/4)*floor((n+1)/4)*floor((n+2)/4)*floor((n+3)/4)</code>.
 * @author Sean A. Irvine
 */
public class A008233 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN / 4).multiply((mN + 1) / 4).multiply((mN + 2) / 4).multiply((mN + 3) / 4);
  }
}

