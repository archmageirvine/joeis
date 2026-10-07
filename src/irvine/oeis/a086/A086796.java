package irvine.oeis.a086;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.DynamicArray;

/**
 * A086796 a(n) is the number of terms in the expansion of (x+y+z)*(x^2+y^2+z^2)*(x^3+y^3+z^3)*...*(x^n+y^n+z^n).
 * @author Sean A. Irvine
 */
public class A086796 extends Sequence0 {

  private DynamicArray<Z> mRows = new DynamicArray<>();
  private DynamicArray<Z> mNext = new DynamicArray<>();
  private int mN = -1;

  /** Construct the sequence. */
  public A086796() {
    // S_0 = {(0,0)}
    mRows.set(0, Z.ONE);
  }

  @Override
  public Z next() {
    ++mN;
    final int oldSum = (mN - 1) * mN / 2;
    final int newSum = mN * (mN + 1) / 2;
    for (int k = 0; k <= newSum; ++k) {
      mNext.set(k, Z.ZERO);
    }
    for (int k = 0; k <= oldSum; ++k) {
      final Z src = mRows.get(k);
      // Choose z^n: (a,b) -> (a,b)
      mNext.set(k, mNext.get(k).or(src));
      // Choose x^n: (a,b) -> (a+n,b)
      mNext.set(k + mN, mNext.get(k + mN).or(src));
      // Choose y^n: (a,b) -> (a,b+n)
      mNext.set(k, mNext.get(k).or(src.shiftLeft(mN)));
    }

    // Swap buffers
    final DynamicArray<Z> tmp = mRows;
    mRows = mNext;
    mNext = tmp;

    // Count the set bits in the active triangular region
    long count = 0;
    for (int k = 0; k <= newSum; ++k) {
      final Z row = mRows.get(k);
      count += row.bitCount();
    }
    return Z.valueOf(count);
  }
}
