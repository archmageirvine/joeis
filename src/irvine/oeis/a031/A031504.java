package irvine.oeis.a031;

import irvine.math.z.Z;
import irvine.oeis.a030.A030069;

/**
 * A031504 Size of lexicographic code of length n, Hamming distance 6 and weight 6.
 * @author Sean A. Irvine
 */
public class A031504 extends A030069 {

  private int mN = 5;

  @Override
  public Z next() {
    if (++mN > 63) {
      throw new UnsupportedOperationException();
    }
    return Z.valueOf(buildLexicographicCode(mN, 6, 6).size());
  }
}
