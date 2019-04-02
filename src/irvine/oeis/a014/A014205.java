package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014205 (1/12)*(n+5)*(n+1)*n^2.
 * @author Sean A. Irvine
 */
public class A014205 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN + 5).multiply(mN + 1).multiply(mN).multiply(mN).divide(12);
  }
}
