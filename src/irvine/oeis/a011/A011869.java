package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A011869 <code>a(n) = floor(n*(n-1)/16)</code>.
 * @author Sean A. Irvine
 */
public class A011869 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(mN).multiply(++mN).divide(16);
  }
}
