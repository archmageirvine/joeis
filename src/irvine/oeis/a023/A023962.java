package irvine.oeis.a023;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023962 First digit after decimal point of cube root of <code>n</code>.
 * @author Sean A. Irvine
 */
public class A023962 implements Sequence {

  private static final CR TEN = CR.valueOf(10);
  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(ComputableReals.SINGLETON.pow(CR.valueOf(++mN), CR.ONE_THIRD).multiply(TEN).floor().mod(10));
  }
}
