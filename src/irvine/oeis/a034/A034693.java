package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034693 Smallest k such that k*n+1 is prime.
 * @author Sean A. Irvine
 */
public class A034693 implements Sequence {

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

