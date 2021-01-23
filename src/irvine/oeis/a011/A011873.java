package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A011873 a(n) = floor(n(n-1)/20).
 * @author Sean A. Irvine
 */
public class A011873 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(mN).multiply(++mN).divide(20);
  }
}
