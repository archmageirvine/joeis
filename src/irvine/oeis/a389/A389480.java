package irvine.oeis.a389;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A389480 allocated for A.H.M. Smeets.
 * @author Sean A. Irvine
 */
public class A389480 extends Sequence0 {

  // todo code here based on python is broken!

  private int mN = 0;
  private int mM = -1;

  private Z t(final int n, final int m) {
    if (n == 0 || n == m || n == 2 * m) {
      return Z.ONE;
    }
    final long g = m / Functions.GCD.l(n, m);
    return Functions.SIGMA0.z(g).divide(1 + (g & 1));

  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mN, mM);
  }
}

/*
T(n,k) = T(n-k,k).

T(n,0) = T(n,n) = 1.

T(n,n/2) = 1, n is even.

T(n,k) = T(n/gcd(n,k),k/gcd(n,k)) and thus T(n*k,k) = T(n,1).

T(n,k) = tau(k)/m iff gcd(n,k) = 1, where m = 1 for k is even and m = 2 for k is odd, tau(k) = A000005(k).
 */

/*


(Python)

from math import gcd

from sympy import divisor_count

def A389480(n, k):

    if n == 0 or n == k or 2*n == k:

        return 1

    else:

        return divisor_count(k//gcd(n, k)) // (1+(k//gcd(n, k))%2)

 */

