package irvine.oeis.a015;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicArray;
import irvine.util.array.LongDynamicIntArray;

/**
 * A015994 Smallest k such that the smallest palindrome &gt; k in the Reverse and Add! trajectory of k is reached after exactly n iterations.
 * Adapted from A023109.
 * @author Sean A. Irvine
 * @author Georg Fischer
 */
public class A015994 extends Sequence1 {

  private final LongDynamicIntArray mIterations = new LongDynamicIntArray();
  private final LongDynamicArray<Z> mValue = new LongDynamicArray<>();
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    // Incrementally extend numbers as required, this prevents us from getting
    // stuck on Lychrel numbers etc.
    long k = 0;
    while (true) {
      int it = mIterations.get(++k);
      if (it == 0) {
        // Just starting with this number
        final Z v = Z.valueOf(k);
        mValue.set(k, v);
      }
      Z v = mValue.get(k);
      if (v != null) {
        while (it < mN) {
          v = v.add(Functions.REVERSE.z(v));
          ++it;
          if (Predicates.PALINDROME.is(10, v)) {
            // Finish this number, save space by storing null (also indicates it is complete)
            v = null;
            break;
          }
        }
        mValue.set(k, v);
        mIterations.set(k, it);
      }
      if (mIterations.get(k) == mN && mValue.get(k) == null) {
        return Z.valueOf(k);
      }
    }
  }
}
