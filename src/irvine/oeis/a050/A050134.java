package irvine.oeis.a050;
// manually posofnin at 2021-08-08

import irvine.math.z.Z;

/**
 * A050134 a(n)=least k satisfying a(k)=3*k in A050132.
 * @author Georg Fischer
 */
public class A050134 extends A050132 {

  protected Z mK;
  
  /** Construct the sequence. */
  public A050134() {
    mK = Z.ZERO;;
  }
  
  @Override
  public Z next() {
    mK = mK.add(1);
    while (!super.next().equals(mK.multiply(3))) {
      mK = mK.add(1);
    }
    return mK;
  }
}
