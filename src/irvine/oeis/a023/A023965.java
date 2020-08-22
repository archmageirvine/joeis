package irvine.oeis.a023;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023965 First digit after decimal point of 6th root of n.
 * @author Sean A. Irvine
 */
public class A023965 implements Sequence {

  private static final CR TEN = CR.TEN;
  private static final CR R = CR.SIX.inverse();
  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(ComputableReals.SINGLETON.pow(CR.valueOf(++mN), R).multiply(TEN).floor().mod(10));
  }
}
