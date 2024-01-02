package irvine.oeis.a121;
// manually 2023-12-24/tuptraf at 2023-12-26 12:51

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A121639 Number of 2-cell columns in all deco polyominoes of height n. A deco polyomino is a directed column-convex polyomino in which the height, measured along the diagonal, is attained only in the last column.
 * @author Georg Fischer
 */
public class A121639 extends AbstractSequence {

  private Z mA;
  private int mN = 0;

  /** Construct the sequence. */
  public A121639() {
    super(1);
  }

  @Override
  public Z next() {
    // a(n) = n*a(n-1)+(n-1)!-(n-3)!
    ++mN;
    if (mN == 1) {
      return Z.ZERO;
    }
    if (mN == 2) {
      return Z.ONE;
    }
    if (mN == 3) {
      mA = Z.FIVE;
      return mA;
    }
    mA = mA.multiply(mN).add(MemoryFactorial.SINGLETON.factorial(mN - 1)).subtract(MemoryFactorial.SINGLETON.factorial(mN - 3));
    return mA;
  }
}
