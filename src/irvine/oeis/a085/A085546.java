package irvine.oeis.a085;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A085546 Starting term of the smallest n-chain of numbers whose squares are permutations of the same digits.
 * @author Sean A. Irvine
 */
public class A085546 extends Sequence1 {

  // After Michael S. Branicky

  private final HashMap<Integer, Long> mFound = new HashMap<>();
  private final HashSet<String> mSeen = new HashSet<>();
  private int mNeed = 2;
  private long mM = 9;

  private static String key(final Z n) {
    final char[] s = n.toString().toCharArray();
    Arrays.sort(s);
    return new String(s);
  }

  @Override
  public Z next() {
    while (true) {
      ++mM;
      final String k = key(Z.valueOf(mM).square());
      if (!mSeen.add(k)) {
        continue;
      }

      final long ub = Functions.SQRT.l(new Z(new StringBuilder(k).reverse().toString()));
      int v = 1;
      for (long t = mM + 1; t <= ub; ++t) {
        if (key(Z.valueOf(t).square()).equals(k)) {
          ++v;
        }
      }

      if (!mFound.containsKey(v)) {
        mFound.put(v, mM);
        while (mFound.containsKey(mNeed)) {
          final Z res = Z.valueOf(mFound.get(mNeed));
          ++mNeed;
          return res;
        }
      }
    }
  }
}
