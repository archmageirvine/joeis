package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A011913 <code>a(n) = floor(n*(n - 1)*(n - 2)/31)</code>.
 * @author Sean A. Irvine
 */
public class A011913 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(mN).multiply(mN - 1).multiply(++mN).divide(31);
  }
}
