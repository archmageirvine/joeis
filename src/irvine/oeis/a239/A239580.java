package irvine.oeis.a239;

import irvine.math.z.Z;
import irvine.oeis.a227.A227364;

/**
 * A239580 Numbers k such that A227364(k) = 1 + 2*3 + 4*5*6 + 7*8*9*10 + ... + ...*k  is a prime.
 * @author Georg Fischer
 */
public class A239580 extends A227364 {

  private int mK = -1;

  {
    setOffset(1);
  }

  @Override
  public Z next() {
    while (true) {
      ++mK;
      if (super.next().isProbablePrime()) {
        return Z.valueOf(mK);
      }
    }
  }
}
