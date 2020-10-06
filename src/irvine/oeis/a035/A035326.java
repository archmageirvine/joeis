package irvine.oeis.a035;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.a023.A023192;

/**
 * A035326 Beginning of last prime pattern of length n to appear among positive integers.
 * @author Sean A. Irvine
 */
public class A035326 extends A023192 {

  private long mN = 0;

  private String makePattern(final long m) {
    final StringBuilder sb = new StringBuilder();
    for (int k = 0; k < mN; ++k) {
      sb.append(mPrime.isPrime(m + k) ? 'p' : 'c');
    }
    return sb.toString();
  }

  @Override
  public Z next() {
    ++mN;
    final long target = super.next().intValueExact();
    long m = 2;
    final HashSet<String> seen = new HashSet<>();
    while (seen.size() != target) {
      final String pattern = makePattern(++m);
      // Not every pattern is admissable
      if (mAdmissable.contains(pattern)) {
        seen.add(pattern);
      }
      //System.out.println(m + " " + seen);
    }
    return Z.valueOf(m);
  }
}

