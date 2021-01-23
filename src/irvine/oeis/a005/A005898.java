package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005898 Centered cube numbers: n^3 + (n+1)^3.
 * @author Sean A. Irvine
 * @author Georg Fischer
 */
public class A005898 implements Sequence {

  protected int mExpon; // exponent 
  private long mN = 0; // always n + 1
  private Z mPrev = Z.ZERO; // n^expon
  
  /** 
   * Empty constructor
   */
  public A005898() {
    this(3);
  }
  
  /**
   * Constructor with exponent
   * @param expon exponent
   */
  public A005898(final int expon) {
    mExpon = expon;
  }

  @Override
  public Z next() {
    final Z temp = mPrev;
    ++mN;
    mPrev = Z.valueOf(mN).pow(mExpon);
    return mPrev.add(temp);
  }
}
