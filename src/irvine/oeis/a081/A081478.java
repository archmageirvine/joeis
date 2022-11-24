package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.a007.A007018;

/**
 * A081478 Consider the mapping f(a/b) = (a - b)/(ab). Taking a = 2 and b = 1 to start with and carrying out this mapping repeatedly on each new (reduced) rational number gives the following sequence 2/1,1/2,-1/2,-3/-2,-1/6,... Sequence contains the denominators.
 * Taking a = 2 and b = 1 to start with and carrying out this mapping repeatedly on each new (reduced) rational number
 * gives the following sequence 2/1, 1/2,-1/2,-3/-2,-1/6,... Sequence contains the denominators.
 * @author Georg Fischer
 */
public class A081478 extends A007018 {

  private int mN = 0;
  private Z mA;

  /** Construct the sequence. */
  public A081478() {
    super.next();
  }

  @Override
  public int getOffset() {
    return 1;
  }

  @Override
  public Z next() {
    // a(2n-1) = A007018(n-1), a(2n) = -A007018(n-1) for n >= 2
    ++mN;
    if (mN <= 2) {
      return Z.valueOf(mN);
    }
    if ((mN & 1) == 1) {
      mA = super.next();
      return mA;
    }
    return mA.negate();
  }
}
