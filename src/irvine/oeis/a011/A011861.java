package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A011861 <code>a(n) = floor(n(n-1)/8)</code>.
 * @author Sean A. Irvine
 */
public class A011861 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(mN).multiply(++mN).divide(8);
  }
}
