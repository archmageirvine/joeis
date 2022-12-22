package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A060730 a(n) = a(n-1) + a(n - 1 minus the number of terms of a(k) == n (mod 3) so far).
 * @author Sean A. Irvine
 */
public class A060730 extends MemorySequence {

  private final int[] mCounts;

  protected A060730(final int mod) {
    mCounts = new int[mod];
    setOffset(1);
  }

  /** Construct the sequence. */
  public A060730() {
    this(3);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n < mCounts.length) {
      ++mCounts[(n + 1) % mCounts.length];
      return Z.valueOf(n + 1);
    }
    final Z t = a(n - 1).add(a(n - 1 - mCounts[(n + 1) % mCounts.length]));
    ++mCounts[(int) t.mod(mCounts.length)];
    return t;
  }
}
