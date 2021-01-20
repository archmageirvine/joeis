package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A038544 Sum(i^3,i=0..10^n).
 * @author Sean A. Irvine
 */
public class A038544 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.TEN.pow(++mN).add(1).square().multiply(Z.TEN.pow(2 * mN)).divide(4);
  }
}
