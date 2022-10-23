package irvine.oeis.a246;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A246417 Homomorphic inverse images of elementary h-ary relations.
 * @author Sean A. Irvine
 */
public class A246417 extends Sequence1 {

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Q s = Q.ZERO;
    for (int h = 3; h <= mN; ++h) {
      int hm = 1;
      int m = 0;
      while ((hm *= h) <= mN) {
        ++m;
        Z t = Z.ZERO;
        for (int l = 1; l <= hm; ++l) {
          t = t.signedAdd((l & 1) == 0, Binomial.binomial(hm, l).multiply(Z.valueOf(l).pow(mN)));
        }
        s = s.signedAdd((h & 1) == 0, new Q(t, mF.factorial(m).multiply(mF.factorial(h).pow(m))));
      }
    }
    return s.toZ();
  }
}
