package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence2;
import irvine.oeis.a006.A006882;

/**
 * A075410 a(n) is the smallest m such that n!!-m and n!!+m are both primes.
 * @author Sean A. Irvine
 */
public class A075410 extends Sequence2 {

  private final Sequence mDoubleFactorials = new A006882().skip(2);

  @Override
  public Z next() {
    final Z f = mDoubleFactorials.next();
    long m = -1;
    while (true) {
      ++m;
      if (f.subtract(m).isProbablePrime() && f.add(m).isProbablePrime()) {
        return Z.valueOf(m);
      }
    }
  }
}
