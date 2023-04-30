package irvine.oeis.a063;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063460 A Beatty sequence: a(n) = floor(n * (Pi-1)/(Pi-2)).
 * @author Sean A. Irvine
 */
public class A063460 extends Sequence1 {

  private static final CR C = CR.PI.subtract(CR.ONE).divide(CR.PI.subtract(CR.TWO));
  private long mN = 0;

  @Override
  public Z next() {
    return C.multiply(++mN).floor();
  }
}
