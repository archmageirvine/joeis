package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A008218 Floor(n/4)*floor((n+1)/4)*floor((n+2)/4).
 * @author Sean A. Irvine
 */
public class A008218 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN / 4).multiply((mN + 1) / 4).multiply((mN + 2) / 4);
  }
}

