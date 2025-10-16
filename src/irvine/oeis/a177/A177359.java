package irvine.oeis.a177;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.AbstractSequence;

/**
 * A177359 a(n) contains the nonzero frequencies f(d) of digits d=0 .. 9 in all terms up to a(n-1) in concatenated form sorted with respect to d: f(0)//0//f(1)//1//...//f(9)//9. Initial term a(1)=0.
 * in concatenated form sorted with respect to d: f(0)//0//f(1)//1//...//f(9)//9. Initial term a(1)=0.
 * 0, 10, 2011, 303112, 40512223
 * @author Georg Fischer
 */
public class A177359 extends AbstractSequence {

  private Z mA; // current term
  private final int[] mDc; // accumulated digit counts

  /** Construct the sequence. */
  public A177359() {
    this(0, 0);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param start initial term
   */
  public A177359(final int offset, final int start) {
    super(offset);
    mA = Z.valueOf(start);
    mDc = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
  }

  @Override
  public Z next() {
    final Z result = mA;
    final int[] dc = ZUtils.digitCounts(mA);
    for (int i = 0; i < 10; ++i) {
      mDc[i] += dc[i];
    }
    mA = ZUtils.describe(mDc);
    return result;
  }
}
