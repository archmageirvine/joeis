package irvine.oeis.a135;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.MemorySequence;

/**
 * A135416 a(n) = A036987(n)*(n+1)/2.
 * @author Georg Fischer
 */
public class A135416 extends AbstractSequence {

  private final int mI; // first parameter of GS(i, j)
  private final int mJ; // second parameter of GS(i, j)
  private final MemorySequence mSeq = new MemorySequence() {
    private int mN;

    {
      add(Z.ZERO);
      mN = 0;
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
  };

  /** Construct the sequence. */
  public A135416() {
    this(1, 1, 5);
  }

  /**
   * Generic constructor with parameters for function GS(i,j) of Guy Steele.
   * @param i first parameter of GS
   * @param j second parameter of GS
   */
  public A135416(final int i, final int j) {
    this(0, i, j);
  }

  /**
   * Generic constructor with parameters for function GS(i,j) of Guy Steele.
   * @param offset first index
   * @param i first parameter of GS
   * @param j second parameter of GS
   */
  public A135416(final int offset, final int i, final int j) {
    super(offset);
    mI = i;
    mJ = j;
  }

  @Override
  public Z next() {
    return mSeq.next();
  }
}
