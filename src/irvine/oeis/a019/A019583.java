package irvine.oeis.a019;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A019583 <code>a(n) = n*(n-1)^4/2</code>.
 * @author Sean A. Irvine
 */
public class A019583 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(mN).pow(4).multiply(++mN).divide2();
  }
}
