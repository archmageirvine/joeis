package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008381 floor(n/5)*floor((n+1)/5)*floor((n+2)/5)*floor((n+3)/5).
 * @author Sean A. Irvine
 */
public class A008381 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN / 5).multiply((mN + 1) / 5).multiply((mN + 2) / 5).multiply((mN + 3) / 5);
  }
}


