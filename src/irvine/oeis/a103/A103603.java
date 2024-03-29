package irvine.oeis.a103;
// Generated by gen_seq4.pl suchprik at 2021-01-04 14:54

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A103603 Numbers k such that the string 101001000k is prime.
 * @author Georg Fischer
 */
public class A103603 extends Sequence1 {
  protected long mK; // number k to be returned
  protected Z mConst1; // constant before k
  protected Z mPow10; // 10^m always > k

  /** Empty constructor */
  public A103603() {
    this("101001000");
  }
  
  /** 
   * Constructor for subclasses, with parameter 
   * @param const1 constant before k
   */
  protected A103603(final String const1) {
    mConst1 = new Z(const1);
    mK = -1;
    mPow10 = Z.TEN;
  }
  
  @Override
  public Z next() {
    boolean busy = true;
    while (busy) {
      ++mK;
      if ((mK & 1) != 1) { 
        ++mK;
      }
      if (Z.valueOf(mK).compareTo(mPow10) >= 0) {
        mPow10 = mPow10.multiply(Z.TEN);
      }
      if (mPow10.multiply(mConst1).add(mK).isProbablePrime()) {
        busy = false;
      }
    }
    return Z.valueOf(mK);
  }
}
