package irvine.oeis.a023;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A023977 First digit after the decimal point of the n-th root of n.
 * @author Sean A. Irvine
 */
public class A023977 extends Sequence1 {

  private static final CR TEN = CR.TEN;
  private long mN = 0;

  @Override
  public Z next() {
    final CR n = CR.valueOf(++mN);
    return Z.valueOf(ComputableReals.SINGLETON.pow(n, n.inverse()).multiply(TEN).floor().mod(10));
  }
}
