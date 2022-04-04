package irvine.oeis.a127;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A127223 a(n) = (n^2)!/n!.
 * @author Georg Fischer
 */
public class A127223 implements Sequence {

  private int mExpon;
  private int mN;
  private static final MemoryFactorial FACTORIAL = MemoryFactorial.SINGLETON;

  /** Construct the sequence. */
  public A127223() {
    this(0, 2);
  }

  /**
   * Generic constructor with parameters
   * @param expon
   */
  public A127223(final int offset, final int expon) {
    mExpon = expon;
    mN = offset - 1;
  }

  @Override
  public Z next() {
    ++mN;
    int nPow = mN;
    for (int i = 2; i <= mExpon; ++i) {
      nPow *= mN;
    }
    return FACTORIAL.factorial(nPow).divide(FACTORIAL.factorial(mN));
  }
}
