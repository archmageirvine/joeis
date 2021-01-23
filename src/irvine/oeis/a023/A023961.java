package irvine.oeis.a023;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023961 First digit after decimal point of square root of n.
 * @author Sean A. Irvine
 */
public class A023961 implements Sequence {

  private static final CR TEN = CR.TEN;
  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(CR.valueOf(++mN).sqrt().multiply(TEN).floor().mod(10));
  }
}
