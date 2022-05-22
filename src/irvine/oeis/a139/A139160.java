package irvine.oeis.a139;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A139160 a(n)=(prime(n)!+2)/2.
 * @author Georg Fischer
 */
public class A139160 extends A000040 {

  private final int mParm;
  private final Z mAbsParm;

  /** Construct the sequence. */
  public A139160() {
    this(1, 2);
  }

  /**
   * Generic constructor with parameters
   * @param offset index of first term
   * @param parm the constant
   */
  public A139160(int offset, final int parm) {
    while (offset > 1) {
      super.next();
      --offset;
    }
    mParm = parm;
    mAbsParm = Z.valueOf(parm < 0 ? -parm : parm);
  }

  @Override
  public Z next() {
    return MemoryFactorial.SINGLETON.factorial(super.next()).add(mParm).divide(mAbsParm);
  }
}
