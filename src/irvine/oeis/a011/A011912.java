package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A011912 a(n) = floor(n(n-1)(n-2)/30).
 * @author Sean A. Irvine
 */
public class A011912 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(mN).multiply(mN - 1).multiply(++mN).divide(30);
  }
}
