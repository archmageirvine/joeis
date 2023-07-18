package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A064586 Order of twisted group 2F4(2^(2*n + 1)).
 * @author Sean A. Irvine
 */
public class A064586 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final Z q = Z.ONE.shiftLeft(2 * ++mN + 1);
    return q.pow(12).multiply(q.subtract(1)).multiply(q.pow(3).add(1)).multiply(q.pow(4).subtract(1)).multiply(q.pow(6).add(1));
  }
}

