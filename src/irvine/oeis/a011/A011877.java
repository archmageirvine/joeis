package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A011877 a(n) = floor(n*(n-1)/24).
 * @author Sean A. Irvine
 */
public class A011877 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(mN).multiply(++mN).divide(24);
  }
}
