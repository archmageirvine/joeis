package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A008382 a(n) = floor(n/5)*floor((n+1)/5)*floor((n+2)/5)*floor((n+3)/5)*floor((n+4)/5).
 * @author Sean A. Irvine
 */
public class A008382 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN / 5).multiply((mN + 1) / 5).multiply((mN + 2) / 5).multiply((mN + 3) / 5).multiply((mN + 4) / 5);
  }
}


