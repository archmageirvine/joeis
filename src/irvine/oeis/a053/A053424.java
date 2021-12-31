package irvine.oeis.a053;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A053424 Fixed point to which iterates of F(n) in A053423 converge.
 * @author Sean A. Irvine
 */
public class A053424 implements Sequence {

  private long mN = 0;

  private long f(final long n) {
    return LongUtils.sqrt(n * n * n) / LongUtils.sqrt(n);
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

