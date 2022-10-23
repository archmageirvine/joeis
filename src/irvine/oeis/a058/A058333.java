package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A058333 Number of 3 X 3 matrices with elements from [0,...,(n-1)] satisfying the condition that the middle element of each row or column is the difference of the two end elements (in absolute value).
 * @author Sean A. Irvine
 */
public class A058333 extends Sequence1 {

  // After Michael S. Branicky

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long count = 0;
    for (long i = 0; i < mN; ++i) {
      for (long j = 0; j < mN; ++j) {
        for (long k = 0; k < mN; ++k) {
          for (long l = 0; l < mN; ++l) {
            if (Math.abs(Math.abs(i - j) - Math.abs(k - l)) == Math.abs(Math.abs(i - k) - Math.abs(j - l))) {
              ++count;
            }
          }
        }
      }
    }
    return Z.valueOf(count);
  }
}
