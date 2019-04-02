package irvine.oeis.a014;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014508 a(n) = floor( n! / e ).
 * @author Sean A. Irvine
 */
public class A014508 implements Sequence {

  private long mN = 0;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return CR.valueOf(mF).divide(CR.E).floor(32);
  }
}
