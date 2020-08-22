package irvine.oeis.a023;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023969 a(n) = round(sqrt(n)) - floor(sqrt(n)).
 * @author Sean A. Irvine
 */
public class A023969 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return CR.valueOf(++mN).sqrt().multiply(CR.TWO).floor().testBit(0) ? Z.ONE : Z.ZERO;
  }
}
