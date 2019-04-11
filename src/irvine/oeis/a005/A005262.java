package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005262 <code>a(n) = floor((7*2^(n+1)-9*n-10)/3)</code>.
 * @author Sean A. Irvine
 */
public class A005262 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.SEVEN.shiftLeft(mN + 1).subtract(9L * mN + 10).divide(3);
  }
}

