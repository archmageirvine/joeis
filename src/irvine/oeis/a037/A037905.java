package irvine.oeis.a037;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A037905 a(n) = 9 - (floor(n*Pi) mod 9).
 * @author Sean A. Irvine
 */
public class A037905 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(9 - CR.PI.multiply(++mN).floor().mod(9));
  }
}
