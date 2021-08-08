package irvine.oeis.a050;
// manually posofnin at 2021-08-08

import irvine.math.z.Z;

/**
 * A050130 a(n)=least k satisfying a(k)=2*k in A050128.
 * @author Georg Fischer
 */
public class A050130 extends A050128 {

  protected Z mK;
  
  /** Construct the sequence. */
  public A050130() {
    mK = Z.ZERO;;
  }
  
  @Override
  public Z next() {
    mK = mK.add(1);
    while (!super.next().equals(mK.multiply(2))) {
      mK = mK.add(1);
    }
    return mK;
  }
}
