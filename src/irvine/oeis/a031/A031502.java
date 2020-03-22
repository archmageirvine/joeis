package irvine.oeis.a031;

import irvine.math.z.Z;
import irvine.oeis.a030.A030069;

/**
 * A031502 Size of lexicographic code of length n, Hamming distance 10 and weight 10.
 * @author Sean A. Irvine
 */
public class A031502 extends A030069 {

  private int mN = 9;

  @Override
  public Z next() {
    if (++mN > 63) {
      throw new UnsupportedOperationException();
    }
    return Z.valueOf(buildLexicographicCode(mN, 10, 10).size());
  }
}
