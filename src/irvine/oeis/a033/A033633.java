package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A033633 Primes modulo 19.
 * @author Sean A. Irvine
 */
public class A033633 extends A000040 {

  protected Z mParm;
  
  /** Construct the sequence */
  public A033633() {
    this(19);
  }
  
  /**
   * Generic constructor with parameter
   * @param parm modulo parameter
   */
  public A033633(final int parm) {
    mParm = Z.valueOf(parm);
  } 

  @Override
  public Z next() {
    return super.next().mod(mParm);
  }
}
