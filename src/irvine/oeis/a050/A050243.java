package irvine.oeis.a050;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A050243 a(n) = floor((1/2 * (sqrt(2) + 1 + sqrt(2*sqrt(2) - 1)))^n ).
 * @author Sean A. Irvine
 */
public class A050243 implements Sequence {

  private static final CR C = CR.SQRT2.add(CR.ONE).add(CR.SQRT2.multiply(2).subtract(CR.ONE).sqrt()).multiply(CR.HALF);
  private long mN = -1;

  @Override
  public Z next() {
    return C.pow(++mN).floor();
  }
}
