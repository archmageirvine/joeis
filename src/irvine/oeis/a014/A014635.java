package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014635 <code>a(n) = 2*n*(4*n - 1)</code>.
 * @author Sean A. Irvine
 */
public class A014635 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN).multiply(4 * mN - 1).multiply2();
  }
}
