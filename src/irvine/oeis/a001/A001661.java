package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A001661 Largest number not the sum of distinct positive n-th powers.
 * @author Sean A. Irvine
 */
public class A001661 implements Sequence {

  // Uses the approach of Dressler & Parker.
  // Uses the set S={1^n,2^n,...,c^n}
  // As c increases, compute set of numbers representable by sums of distinct elements of S
  // If c^n+1 consecutive values are representable, then all numbers greater than that
  // are guaranteed to be representable.

  private int mN = 1;

  private long pow(final long n, final int e) {
    long t = n;
    for (int k = 1; k < e; ++k) {
      t *= n;
    }
    return t;
  }

  @Override
  public Z next() {
    ++mN;
    final LongDynamicBooleanArray expressible = new LongDynamicBooleanArray();
    final long limit = (long) Math.pow(Long.MAX_VALUE, 1.0 / mN);
    long c = 0;
    while (true) {
      if (++c >= limit) {
        throw new UnsupportedOperationException();
      }
      final long t = pow(c, mN);
      long w = expressible.length();
      while ((w = expressible.prevSetBit(w)) >= 0) {
        expressible.set(w + t);
      }
      expressible.set(t);
      long prev = -1;
      long start = 0;
      long consec = 0;
      long a = -1;
      while ((a = expressible.nextSetBit(a)) >= 0) {
        if (a == prev + 1) {
          if (++consec == t) {
            final long potentialBingo = start - 1;
            //System.out.println("Potential: " + potentialBingo + " c=" + c);
            long d = c;
            final long lim = (long) Math.pow(potentialBingo, 1.0 / mN);
            boolean ok = true;
            while (++d <= lim) {
              final long u = pow(d, mN);
              if (expressible.isSet(potentialBingo - u)) {
                //System.out.println("Failed bingo with d=" + d);
                ok = false;
                break;
              }
            }
            if (ok) {
              return Z.valueOf(potentialBingo);
            }
          }
        } else {
          start = a;
          consec = 0;
        }
        prev = a;
      }
    }
  }
}
