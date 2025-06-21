package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078193 In the following triangle the n-th row contains n n-digit (or (n-1)-digit) numbers whose concatenation (with a 0 prefixed for (n-1)-digit numbers) gives a substring of the cyclic concatenation of 1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9,0,1,2,...: 1; 12 34; 123 456 789; 1234 5678 9012 3456; 12345 67890 12345 67890 12345; ... Sequence contains the final terms of rows.
 * @author Sean A. Irvine
 */
public class A078193 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long d = ((mN - 1) * mN + 1) % 10;
    Z v = Z.ZERO;
    for (long k = 0; k < mN; ++k) {
      v = v.multiply(10).add(d);
      if (++d == 10) {
        d = 0;
      }
    }
    return v;
  }
}

