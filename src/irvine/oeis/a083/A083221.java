package irvine.oeis.a083;

import irvine.math.z.Z;

/**
 * A083221 Sieve of Eratosthenes arranged as an array and read by antidiagonals as A(1,1), A(1,2), A(2,1), A(1,3), A(2,2), A(3,1), ...
 * @author Sean A. Irvine
 */
public class A083221 extends A083140 {

  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mM);
  }
}

