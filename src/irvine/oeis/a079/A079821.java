package irvine.oeis.a079;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A079821 Smallest n-digit multiple of the n-th prime.
 * @author Sean A. Irvine
 */
public class A079821 extends A000040 {

  private long mN = -1;

  @Override
  public Z next() {
    final Z p = super.next();
    return Z.TEN.pow(++mN).add(p.subtract(1)).divide(p).multiply(p);
  }
}

