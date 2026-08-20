package irvine.oeis.a136;

import irvine.math.cr.CR;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A136546 Three-part semi-chaotic binary digit sum/product sequence modeled on a Rudin-Shapiro-type sequence like A014081.
 * @author Sean A. Irvine
 */
public class A136546 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(1, CR.LOG2.multiply(++mN).floor().longValueExact(),
      k -> Z.valueOf((1 + (mN - mN / (1L << k)) * (mN - 1 - mN / (1L << (k - 1)))) & 1));
  }
}

