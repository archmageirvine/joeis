package irvine.oeis.a163;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A163382 <code>a(n) =</code> the (decimal equivalent of the) smallest integer that can be made by rotating the binary digits of <code>n any</code> number of positions to the left or right, where <code>a(n)</code> in binary must contain the same number of digits (without <code>any</code> leading 0's) as n written in binary.
 * @author Sean A. Irvine
 */
public class A163382 implements Sequence {

  private long mN = 0;
  private long mL = 1;
  private long mM = 0;
  private int mK = 0;

  @Override
  public Z next() {
    long n = ++mN;
    if ((n & (n - 1)) == 0) {
      ++mK;
      mL = n;
      mM = (mL << 1) - 1;
    }
    long min = n;
    for (int k = 1; k < mK; ++k) {
      if ((n & mL) == 0) {
        n <<= 1;
      } else {
        n <<= 1;
        n |= 1;
        n &= mM;
      }
      if ((n & mL) != 0 && n < min) {
        min = n;
      }
    }
    return Z.valueOf(min);
  }
}

