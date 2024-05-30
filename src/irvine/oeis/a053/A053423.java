package irvine.oeis.a053;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A053423 The mapping F(n) = floor(floor(n*sqrt(n)) / floor(sqrt(n))) iterates to a fixed point; a(n) is the least k such that f(k,n)=f(k-1,n), where f(0,n)=n, f(1,n)=F(n), f(k,n)=f(k-1,F(n)).
 * @author Sean A. Irvine
 */
public class A053423 extends Sequence1 {

  private long mN = 0;

  private long f(final long n) {
    return Functions.SQRT.l(n * n * n) / Functions.SQRT.l(n);
  }

  private long f(final long k, final long n) {
    return k == 0 ? n : k == 1 ? f(n) : f(k - 1, f(n));
  }

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    long r = mN;
    while (true) {
      final long t = r;
      r = f(++k, mN);
      if (t == r) {
        return Z.valueOf(k);
      }
    }
  }
}

