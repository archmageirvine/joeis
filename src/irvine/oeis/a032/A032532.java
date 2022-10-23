package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A032532 Integer part of decimal 'base-2 looking' numbers divided by their actual base-2 values (denominator of a(n) is n, numerator is n written in binary but read in decimal).
 * @author Sean A. Irvine
 */
public class A032532 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return new Z(Long.toString(++mN, 2)).divide(mN);
  }
}
