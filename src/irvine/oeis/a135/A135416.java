package irvine.oeis.a135;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A135416 a(n) = A036987(n)*(n+1)/2.
 * @author Georg Fischer
 */
public class A135416 extends MemorySequence {

  protected int mN;
  private final int mI;
  private final int mJ;

  /** Construct the sequence. */
  public A135416() {
    this(1, 5);
    setOffset(1);
  }

  /**
   * Generic constructor with parameters for function GS(i,j) of Guy Steele.
   * @param i first parameter of GS
   * @param j second parameter of GS
   */
  public A135416(final int i, final int j) {
    super(0);
    add(Z.ZERO);
    mN = 0;
    mI = i;
    mJ = j;
  }

  @Override
  public Z computeNext() {
    ++mN;
    if (mN == 1) {
      return Z.ONE;
    }
    final int m = size();
    final int n = m / 2;
    switch (((m & 1) == 0) ? mI : mJ) {
      case 1:
        return Z.ZERO;
      case 2:
        return Z.ONE;
      case 3:
        return a(n);
      case 4:
        return a(n).add(1);
      case 5:
        return a(n).multiply2();
      case 6:
      default:
        return a(n).multiply2().add(1);
    }
  }
}
