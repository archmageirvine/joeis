package irvine.oeis.a064;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A064437 a(1)=1, a(n) = a(n-1) + 3 if n is already in the sequence, a(n) = a(n-1) + 2 otherwise.
 * @author Georg Fischer
 */
public class A064437 extends AbstractSequence {

  protected int mN;
  protected int mOffset;
  protected Z mInit;
  protected Z mPrev; // a(n-1)
  protected Z mPrev2; // a(n-2); used in A111202 etc.
  protected Z mAdd1;
  protected Z mAdd2;
  protected final TreeSet<Z> mSet = new TreeSet<>();

  /** Construct the sequence. */
  public A064437() {
    this(1, 1, 3, 2);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param init value of a(offset)
   * @param add1 add this to a(n-1) in the first case
   * @param add2 add this to a(n-1) in the second case
   */
  public A064437(final int offset, final int init, final int add1, final int add2) {
    super(offset);
    mN = offset - 1;
    mOffset = offset;
    mInit = Z.valueOf(init);
    mAdd1 = Z.valueOf(add1);
    mAdd2 = Z.valueOf(add2);
    mPrev2 = Z.ZERO;
  }

  @Override
  public Z next() {
    ++mN;
    final Z result = (mN == mOffset) ? mInit : (mSet.contains(Z.valueOf(mN)) ? mPrev.add(mAdd1) : mPrev.add(mAdd2));
    mPrev2 = mPrev;
    mPrev = result;
    mSet.add(result);
    return result;
  }
}
