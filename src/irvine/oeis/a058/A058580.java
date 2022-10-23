package irvine.oeis.a058;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A058580 a(n) is the least natural number m such that the fractional part of m*(2^0.5) is less than 2^(-n).
 * @author Sean A. Irvine
 */
public class A058580 extends Sequence1 {

  private int mN = 0;
  private long mM = 1;

  @Override
  public Z next() {
    final CR bound = CR.valueOf(Z.ONE.shiftLeft(++mN)).inverse();
    while (CR.SQRT2.multiply(mM).frac().compareTo(bound) >= 0) {
      ++mM;
    }
    return Z.valueOf(mM);
  }
}
