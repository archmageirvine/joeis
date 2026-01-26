package irvine.oeis.a383;

import java.util.HashSet;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A383743 a(n) is the smallest prime not yet in the sequence that satisfies the following: for some pair of different digits i and j in a(n-1), i preceding j (from left to right), j precedes i in a(n). Leading 0's are not allowed; a(1)=13. See Comments for details.
 * @author Sean A. Irvine
 */
public class A383743 extends Sequence1 {

  private static final Z Z13 = Z.valueOf(13);
  private final Fast mPrime = new Fast();
  private final HashSet<Z> mUsed = new HashSet<>();
  private Z mA = null;

  private boolean isValid(final Z prev, final Z next, final int common) {
    final String ps = prev.toString();
    final String ns = next.toString();
    for (int d = 0; d < 10; ++d) {
      if ((common & (1 << d)) != 0) {
        for (int e = 0; e < 10; ++e) {
          if (d != e && (common & (1 << e)) != 0) {
            // d and e and now two distinct digits occurring in both prev and next
            //System.out.println(prev + " " + next + " " + d + " " + e);
            final char dc = (char) (d + '0');
            final char ec = (char) (e + '0');
            if (ps.indexOf(dc) < ps.lastIndexOf(ec) && ns.indexOf(ec) < ns.lastIndexOf(dc)) {
              return true;
            }
          }
        }
      }
    }
    return false;
  }

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z13;
      return mA;
    }
    final int syn = Functions.SYNDROME.i(mA); // Used for quick check of 2 digits in common
    Z p = Z13;
    while (true) {
      p = mPrime.nextPrime(p);
      final int sp = Functions.SYNDROME.i(p);
      if (Long.bitCount(sp & syn) >= 2 && !mUsed.contains(p) && isValid(mA, p, sp & syn)) {
        mUsed.add(p);
        mA = p;
        return mA;
      }
    }
  }
}

