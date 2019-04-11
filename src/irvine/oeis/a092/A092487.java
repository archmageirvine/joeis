package irvine.oeis.a092;

import java.util.ArrayList;

import irvine.factor.prime.Fast;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A092487 <code>a(n) =</code> least k such that <code>{n+1, n+2, n+3, ... n+k}</code> has a subset the product of whose members with n is a square.
 * @author Sean A. Irvine
 */
public class A092487 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  private boolean isSquare(final long n) {
    final long s = LongUtils.sqrt(n);
    return s * s == n;
  }

  private boolean isSquare(final Z n) {
    return n.sqrtAndRemainder()[1].equals(Z.ZERO);
  }

  @Override
  public Z next() {
    ++mN;
    if (isSquare(mN)) {
      return Z.ZERO;
    }
    if (mPrime.isPrime(mN)) {
      return Z.valueOf(mN > 3 ? mN : mN + 2);
    }
    // products keeps track of all possible products in the subset so far
    // as soon as we encounter a square we are done
    final ArrayList<Z> products = new ArrayList<>();
    final Z n = Z.valueOf(mN);
    products.add(n);
    long k = 0;
    while (true) {
      final Z next = Z.valueOf(mN + ++k);
      final int lim = products.size();
      for (int j = 0; j < lim; ++j) {
        final Z p = products.get(j).multiply(next);
        if (isSquare(p)) {
          return Z.valueOf(k);
        }
        products.add(p);
      }
    }
  }
}
