package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.util.Permutation;

/**
 * A007934.
 * @author Sean A. Irvine
 */
public class A007934 extends A007933 {

  private boolean isPermPrime(final Z n) {
    // This is tricky because of cases like 11 (swap the two ones) or 13 <--> 31
    final String s = n.toString();
    final Permutation perm = new Permutation(s.length());
    perm.next(); // skip trivial permutation
    int[] p;
    while ((p = perm.next()) != null) {
      long v = 0;
      for (final int t : p) {
        v *= 10;
        v += s.charAt(t) - '0';
      }
      if (mPrime.isPrime(v)) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      final Z n = super.next();
      if (isPermPrime(n)) {
        return n;
      }
    }
  }
}
