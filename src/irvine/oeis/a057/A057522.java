package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A057522 a(n+1) = a(n)/2 if 2|a(n), a(n)/3 if 3|a(n), a(n)/5 if 5|a(n), a(n)/7 if 7|a(n), a(n)/11 if 11|a(n), otherwise 13*a(n)+1.
 * @author Georg Fischer
 */
public class A057522 implements Sequence {

  private int mN;
  private final Z[] mList;
  private Z mA;
  private final int mILast;

  /** Construct the sequence. */
  public A057522() {
    this(73, 2, 3, 5, 7, 11, 13);
  }

  /**
   * Generic constructor with parameters
   * @param a0 starting term
   * @param list list of primes: divide by all but last, else multiply with last and add 1.
   */
  public A057522(final int a0, final int... list) {
    mILast = list.length - 1;
    mList = new Z[list.length];
    for (int i = 0; i <= mILast; ++i) {
      mList[i] = Z.valueOf(list[i]);
    }
    mA = Z.valueOf(a0);
    mN = -1;
  }

  /**
   * Maps a number under the "Px+1" map.
   * P is a prime &gt;= 3.
   * @param a the number to be mapped
   */
  protected Z pxPlus1Map(final Z a) {
    for (int i = 0; i < mILast; ++i) {
      final Z[] quot = a.divideAndRemainder(mList[i]);
      if (quot[1].isZero()) {
        return quot[0];
      }
    }
    return a.multiply(mList[mILast]).add(1);
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return mA;
    }
    mA = pxPlus1Map(mA);
    return mA;
  }
}
