package irvine.oeis.a192;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.oeis.a013.A013560;
import irvine.util.array.LongDynamicLongArray;

/**
 * A192053 Maximum probability of permutation from bad "shuffle" times n^n.
 * @author Sean A. Irvine
 */
public class A192053 extends A013560 {

  // With this property normal action is suspended and the permutations are written
  // (in packed form) to stdout. Then externally that can be sorted and counted to
  // find the maximum.  For exampple,
  // java irvine.oeis.a192.A192053 6 | sort | uniq -c | sort -n | tail
  private boolean mSpecial = false;
  private int mN = 0;

  @Override
  public Z next() {
    final LongDynamicLongArray counts = new LongDynamicLongArray();
    final int[] deck = new int[++mN];
    int[] p = new int[mN];
    do {
      // Apply Phi shuffle
      IntegerUtils.identity(deck);
      for (int k = 0; k < deck.length; ++k) {
        final int t = deck[p[k]];
        deck[p[k]] = deck[k];
        deck[k] = t;
      }
      // Pack permutation into a single long
      long packed = 0;
      for (int t : deck) {
        packed *= mN;
        packed += t;
      }
      if (mSpecial) {
        System.out.println(packed);
      } else {
        counts.set(packed, counts.get(packed) + 1);
      }
    } while (bump(p, mN));
    long maxCount = 0;
    for (long k = 0; k < counts.length(); ++k) {
      maxCount = Math.max(maxCount, counts.get(k));
    }
    return Z.valueOf(maxCount);
  }

  /**
   * Explicitly generate all the (packed) permutations for a particular value of n
   * @param args n
   */
  public static void main(final String... args) {
    final A192053 seq = new A192053();
    seq.mSpecial = true;
    seq.mN = Integer.parseInt(args[0]) - 1;
    seq.next();
  }
}
