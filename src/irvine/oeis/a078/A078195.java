package irvine.oeis.a078;

import irvine.math.z.Z;

/**
 * A078195 In the following triangle the n-th row contains n n-digit (or (n-1)-digit) numbers whose concatenation (with a 0 prefixed for (n-1)-digit numbers) gives a substring of the cyclic concatenation of 1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9,0,1,2,...: 1; 12 34; 123 456 789; 1234 5678 9012 3456; 12345 67890 12345 67890 12345; ... Sequence contains the sum of the terms of a row.
 * @author Sean A. Irvine
 */
public class A078195 extends A078194 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k < mN; ++k) {
      sum = sum.add(super.next());
    }
    return sum;
  }
}

