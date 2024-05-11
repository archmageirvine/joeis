package irvine.oeis.a111;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A111862 Second digit after decimal point of square root of n.
 * @author GEorg Fischer
 */
public class A111862 extends Sequence1 {

  private static final CR HUNDRED = CR.valueOf(100);
  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(CR.valueOf(++mN).sqrt().multiply(HUNDRED).floor().mod(10));
  }
}
