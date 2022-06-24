package irvine.oeis.a057;

import java.util.TreeSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A057692 Smallest prime which produces exactly n+1 different primes after n applications of the A048376 transform.
 * @author Sean A. Irvine
 */
public class A057692 implements Sequence {

  private static final String[] EXPANSIONS = {
    "",
    "1",
    "22",
    "333",
    "4444",
    "55555",
    "666666",
    "7777777",
    "88888888",
    "999999999"
  };

  private int mN = -1;
  private final Fast mPrime = new Fast();

  /**
   * Expand a number by replacing each digit d with d repeated d times (i.e., 3 goes to 333).
   * @param n number to expand
   * @return expanded number
   */
  public static Z expand(final Z n) {
    final StringBuilder sb = new StringBuilder();
    Z m = n;
    while (!m.isZero()) {
      final Z[] qr = m.divideAndRemainder(Z.TEN);
      sb.append(EXPANSIONS[qr[1].intValue()]);
      m = qr[0];
    }
    return new Z(sb.reverse());
  }

  @Override
  public Z next() {
    ++mN;
    Z p = Z.ONE;
    final TreeSet<Z> seen = new TreeSet<>();
    while (true) {
      seen.clear();
      p = mPrime.nextPrime(p);
      Z q = p;
      seen.add(q);
      for (int k = 0; k < mN; ++k) {
        q = expand(q);
        if (!q.isProbablePrime()) {
          break;
        }
        if (!seen.add(q)) {
          break;
        }
      }
      if (seen.size() == mN + 1) {
        return p;
      }
    }
  }
}
