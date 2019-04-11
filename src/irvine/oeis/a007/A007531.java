package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007531 <code>a(n) = n*(n-1)*(n-2)</code> (or <code>n!/(n-3)!)</code>.
 * @author Sean A. Irvine
 */
public class A007531 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN).multiply(mN - 1).multiply(mN - 2);
  }
}
