package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046966 a(n) is the smallest number &gt; a(n-1) such that a(1)*a(2)*...*a(n) + 1 is prime.
 * @author Sean A. Irvine
 */
public class A046966 implements Sequence {

  protected Z mProd = Z.ONE;
  private Z mA = Z.ZERO;

  /** Construct the sequence */
  public A046966() {
    this(1);
  }
  
  /** 
   * Generic constructor with parameter
   * @param start initial value of the product
   */
  public A046966(final int start) {
  	mProd = Z.valueOf(start);
  }
  
  @Override
  public Z next() {
    while (true) {
      mA = mA.add(1);
      final Z t = mProd.multiply(mA);
      if (t.add(1).isProbablePrime()) {
        mProd = t;
        return mA;
      }
    }
  }
}
