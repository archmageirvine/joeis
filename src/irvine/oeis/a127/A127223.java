package irvine.oeis.a127;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A127223 a(n) = (n^2)!/n!.
 * @author Georg Fischer
 */
public class A127223 extends AbstractSequence {

  private final int mExpon;
  private int mN;

  /** Construct the sequence. */
  public A127223() {
    this(0, 2);
  }

  /**
   * Generic constructor with parameters
   * @param expon
   */
  public A127223(final int offset, final int expon) {
    super(offset);
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
    return Functions.FACTORIAL.z(nPow).divide(Functions.FACTORIAL.z(mN));
  }
}
