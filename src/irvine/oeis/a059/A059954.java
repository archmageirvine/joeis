package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.a051.A051775;

/**
 * A059954 Number of 2 X 2 matrices with elements from {0,1,2,...,n} and with Nim-Determinant 1. (The Nim-Determinant of the 2 X 2 matrix [a,b; c,d] is defined to be a*d xor b*c, where * denotes Nim-Multiplication.).
 * @author Sean A. Irvine
 */
public class A059954 extends A051775 {

  /** Construct the sequence. */
  public A059954() {
    super(1);
  }

  // This could me made incremental (i.e., avoid recomputing < mN cases)

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long h = 0; h <= mN; ++h) {
      for (long i = 0; i <= mN; ++i) {
        final Z a = nimMultiply(h, i);
        for (long j = 0; j <= mN; ++j) {
          for (long k = 0; k <= mN; ++k) {
            final Z b = nimMultiply(j, k);
            final Z det = nimSum(a, b);
            if (Z.ONE.equals(det)) {
              ++cnt;
            }
          }
        }
      }
    }
    return Z.valueOf(cnt);
  }
}
