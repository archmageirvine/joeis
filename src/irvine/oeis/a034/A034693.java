package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A034693 Smallest k such that k*n+1 is prime.
 * @author Sean A. Irvine
 */
public class A034693 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z t = Z.ONE;
    long k = 0;
    do {
      ++k;
      t = t.add(mN);
    } while (!t.isProbablePrime());
    return Z.valueOf(k);
  }
}

