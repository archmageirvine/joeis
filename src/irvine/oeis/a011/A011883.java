package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A011883 <code>a(n) = floor(n*(n-1)/30)</code>.
 * @author Sean A. Irvine
 */
public class A011883 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(mN).multiply(++mN).divide(30);
  }
}
