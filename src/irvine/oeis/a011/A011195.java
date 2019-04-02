package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A011195 n*(n+1)*(2*n+1)*(3*n+1)/6.
 * @author Sean A. Irvine
 */
public class A011195 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN).multiply(mN + 1).multiply(2 * mN + 1).multiply(3 * mN + 1).divide(6);
  }
}

