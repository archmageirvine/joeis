package irvine.oeis.a006;

import java.util.Arrays;

import irvine.factor.prime.Fast;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006310 <code>a(n) =</code> norm of Heilbronn sum <code>NH_{p}</code>, with p <code>= prime(n)</code>.
 * @author Sean A. Irvine
 */
public class A006310 implements Sequence {

  // Based on C code by Ken Yamamura

  private final Fast mPrime = new Fast();
  private long mQ = 2;

  /* The p-th Heilbronn sum :
     H_p=Tr_{Q(\zeta)/K_1}(\zeta)=\sum_{i=1}^{p-1}\zeta^{i^p}
     \zeta=\zeta_{p^2} */
  @Override
  public Z next() {
    mQ = mPrime.nextPrime(mQ);
    final long q2 = mQ * mQ;
    if (q2 != (int) q2) {
      throw new UnsupportedOperationException();
    }
    final int p = (int) mQ;
    final int p2 = (int) q2;
    final int m = p2 - (int) mQ;
    final int n = m - 1;
    final int n2 = n << 1;

    // a[i]\zeta^i:\zeta^{p^2}=1
    final int[] a = new int[p2];
    for (int i = 1; i < p; ++i) {
      final int j = (int) LongUtils.modPow(i, p, p2);
      if (j < m) {
        a[j] = 1;
      } else {
        for (int k = j - p; k >= j - m; k -= p) {
          a[k] = -1;
        }
      }
    }

    // Calculation of the absolute norm of the p-th Heilbronn sum
    final Z[] d = new Z[n2 + 1];
    Arrays.fill(d, Z.ZERO);
    for (int i = 0; i <= n; ++i) {
      if (a[i] != 0) {
        d[i] = Z.valueOf(a[i]);
      }
    }
    final int[] b = new int[p2];
    for (int h = 1 + p, l = 1; l < p; ++l, h += p) {
      // Conjugate : b[J]\zeta^J
      Arrays.fill(b, 0);
      b[0] = a[0];
      for (int j = 1, i = 0; j <= n; ++j) {
        i += h;
        i %= p2;
        b[i] = a[j];
      }
      for (int k = p2 - 1; k >= m; --k) {
        if (b[k] != 0) {
          for (int j = k - p; j >= k - m; j -= p) {
            b[j] -= b[k];
          }
        }
      }
      // Multiply d by b
      for (int j = n; j >= 0; j--) {
        if (d[j].signum() != 0) {
          for (int k = n; k > 0; k--) {
            if (b[k] != 0) {
              d[j + k] = d[j + k].add(d[j].multiply(b[k]));
            }
          }
          d[j] = d[j].multiply(b[0]);
        }
      }
      for (int k = n2; k >= m; k--) {
        if (d[k].signum() != 0) {
          for (int j = k - p; j >= k - m; j -= p) {
            d[j] = d[j].subtract(d[k]);
          }
          d[k] = Z.ZERO;
        }
      }
    }
    return d[0];
  }
}

