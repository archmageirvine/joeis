package irvine.oeis.a019;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A019582 <code>n*(n-1)^3/2</code>.
 * @author Sean A. Irvine
 */
public class A019582 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(mN).pow(3).multiply(++mN).divide2();
  }
}
