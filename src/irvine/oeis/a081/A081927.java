package irvine.oeis.a081;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081927 n-th positive integer whose digits sum up to n.
 * @author Sean A. Irvine
 */
public class A081927 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long r = 0;
    for (long k = 0; k < mN; ++k) {
      while (Functions.DIGIT_SUM.l(++r) != mN) {
        // do nothing
      }
    }
    return Z.valueOf(r);
  }
}
