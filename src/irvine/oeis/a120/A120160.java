package irvine.oeis.a120;

import irvine.math.q.Q;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A120160 a(n) = ceiling(Sum_{i=1..n-1} a(i)/4) for n &gt;= 2 starting with a(1) = 1.
 * @author Georg Fischer
 */
public class A120160 extends MemorySequence {

  private int mN;
  private final Z mStart;
  private final Z mDiv;

  /** Construct the sequence. */
  public A120160() {
    this(1, 0, 4);
  }

  /**
   * Generic constructor with parameters
   * @param start value of a(1)
   * @param add add this to the sum (ignored)
   * @param div divisor
   */
  public A120160(final int start, final int add, final int div) {
    mN = 0;
    mStart = Z.valueOf(start);
    mDiv = Z.valueOf(div);
    add(Z.ZERO); // a(0) does not exist
    setOffset(1);
  }

  @Override
  public Z computeNext() {
    ++mN;
    if (mN == 1) {
      return mStart;
    }
    return new Q(Integers.SINGLETON.sum(1, mN - 1, k -> a(k)), mDiv).ceiling();
  }
}
