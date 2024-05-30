package irvine.oeis.a053;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A053424 Fixed point to which iterates of F(n) in A053423 converge.
 * @author Sean A. Irvine
 */
public class A053424 extends Sequence1 {

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
        return Z.valueOf(t);
      }
    }
  }
}

