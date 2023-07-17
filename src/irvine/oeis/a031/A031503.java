package irvine.oeis.a031;

import irvine.math.z.Z;
import irvine.oeis.a030.A030069;

/**
 * A031503 Size of lexicographic code of length n, Hamming distance 12 and weight 12.
 * @author Sean A. Irvine
 */
public class A031503 extends A030069 {

  /** Construct the sequence. */
  public A031503() {
    super(12);
  }

  private int mN = 11;

  @Override
  public Z next() {
    if (++mN > 63) {
      throw new UnsupportedOperationException();
    }
    return Z.valueOf(buildLexicographicCode(mN, 12, 12).size());
  }
}
