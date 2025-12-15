package irvine.oeis.a082;

import java.util.HashSet;

import irvine.math.LongUtils;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082595 Let QR be the set of quadratic residues mod n: QR = {x^2 mod n, 1 &lt;= x &lt;= n-1}. Let MR be the set of values taken by 2^x mod n: MR = {2^x mod n, 0 &lt;= x &lt;= n-2}. Usually if QR is a subset of MR then n is prime and otherwise n is composite. Sequence gives numbers that violate this rule, i.e., composites where QR is a subset of MR and primes where QR is not a subset of MR.
 * @author Sean A. Irvine
 */
public class A082595 extends Sequence1 {

  private long mN = 3;

  private HashSet<Long> qr(final long n) {
    final HashSet<Long> s = new HashSet<>();
    for (long k = 1; k < n; ++k) {
      s.add(LongUtils.modPow(k, 2, n));
    }
    return s;
  }

  private HashSet<Long> mr(final long n) {
    final HashSet<Long> s = new HashSet<>();
    for (long k = 0; k < n - 1; ++k) {
      s.add(LongUtils.modPow(2, k, n));
    }
    return s;
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final HashSet<Long> qr = qr(mN);
      final HashSet<Long> mr = mr(mN);
      final boolean subset = mr.containsAll(qr);
      if (Predicates.PRIME.is(mN)) {
        if (!subset) {
          return Z.valueOf(mN);
        }
      } else {
        if (subset) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
