package irvine.oeis.a079;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079879 Median prime factor: a(1)=1 and for n&gt;1: least prime p such that not more than floor(Omega(n)/2) prime factors are greater than p; Omega(n) is the total number of prime factors of n (A001222).
 * @author Sean A. Irvine
 */
public class A079879 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    final long omega = fs.bigOmega();
    long k = 0;
    for (final Z p : fs.toZArray()) {
      final int e = fs.getExponent(p);
      k += e;
      if (2 * k >= omega) {
        return p;
      }
    }
    return Z.ONE;
  }
}

