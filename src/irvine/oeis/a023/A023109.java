package irvine.oeis.a023;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.LongDynamicArray;
import irvine.util.array.LongDynamicIntArray;

/**
 * A023109 a(0) = 0. For n &gt; 0, smallest non-palindromic number k such that the smallest palindrome in the Reverse and Add! trajectory of k is reached after exactly n iterations.
 * @author Sean A. Irvine
 */
public class A023109 extends Sequence0 {

  private final LongDynamicIntArray mIterations = new LongDynamicIntArray();
  private final LongDynamicArray<Z> mValue = new LongDynamicArray<>();
  private final int mBase;
  private int mN = -1;

  protected A023109(final int base) {
    mBase = base;
  }

  /** Construct the sequence. */
  public A023109() {
    this(10);
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    // Incrementally extend numbers as required, this prevents us from getting
    // stuck on Lychrel numbers etc.
    long k = 0;
    while (true) {
      int it = mIterations.get(++k);
      if (it == 0) {
        // Just starting with this number
        final Z v = Z.valueOf(k);
        if (Predicates.PALINDROME.is(mBase, v)) {
          // Handle case where number is already a palindrome, mark as -1 so we don't ever consider it again
          mIterations.set(k, -1);
        } else {
          mValue.set(k, v);
        }
      }
      Z v = mValue.get(k);
      if (v != null) {
        while (it < mN) {
          v = v.add(Functions.REVERSE.z(mBase, v));
          ++it;
          if (Predicates.PALINDROME.is(mBase, v)) {
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
