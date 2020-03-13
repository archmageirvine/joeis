package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A011197 <code>a(n) = n*(n+1)*(2*n+1)*(3*n+1)*(4*n+1)/6</code>.
 * @author Sean A. Irvine
 */
public class A011197 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN).multiply(mN + 1).multiply(2 * mN + 1).multiply(3 * mN + 1).multiply(4 * mN + 1).divide(6);
  }
}

