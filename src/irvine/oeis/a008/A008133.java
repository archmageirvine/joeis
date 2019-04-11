package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008133 <code>a(n) = floor(n/3)*floor((n+1)/3)</code>.
 * @author Sean A. Irvine
 */
public class A008133 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN / 3).multiply((mN + 1) / 3);
  }
}

