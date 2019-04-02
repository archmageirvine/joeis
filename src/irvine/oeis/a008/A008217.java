package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008217 Floor(n/4)*floor((n+1)/4).
 * @author Sean A. Irvine
 */
public class A008217 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN / 4).multiply((mN + 1) / 4);
  }
}

