package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078194 In the following triangle the n-th row contains n n-digit (or (n-1)-digit) numbers whose concatenation (with a 0 prefixed for (n-1)-digit numbers) gives a substring of the cyclic concatenation of 1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9,0,1,2,...: 1; 12 34; 123 456 789; 1234 5678 9012 3456; 12345 67890 12345 67890 12345; ... Sequence contains the triangle by rows.
 * @author Sean A. Irvine
 */
public class A078194 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;
  private long mD = 0;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
      mD = 1;
    }
    Z v = Z.ZERO;
    for (long k = 0; k < mN; ++k) {
      v = v.multiply(10).add(mD);
      if (++mD == 10) {
        mD = 0;
      }
    }
    return v;
  }
}

