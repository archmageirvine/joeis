package irvine.oeis.a145;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A145231 a(n) = Fibonacci(4^n).
 * @author Georg Fischer
 */
public class A145231 extends AbstractSequence {

  private final int mBase;
  private int mProd;

  /** Construct the sequence. */
  public A145231() {
    this(0, 4);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param base take a power of this
   */
  public A145231(final int offset, final int base) {
    super(offset);
    mBase = base;
    mProd = 1;
  }

  @Override
  public Z next() {
    final Z result = Functions.FIBONACCI.z(mProd);
    mProd *= mBase;
    return result;
  }
}
