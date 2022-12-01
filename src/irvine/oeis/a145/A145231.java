package irvine.oeis.a145;

import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A145231 a(n) = Fibonacci(4^n).
 * @author Georg Fischer
 */
public class A145231 extends Sequence0 {

  private int mOffset;
  private int mBase;
  private int mProd;

  /** Construct the sequence. */
  public A145231() {
    this(0, 4);
  }

  /**
   * Generic constructor with parameters
   * @param offset fírst index
   * @param base take a power of this
   */
  public A145231(final int offset, final int base) {
    mOffset = offset;
    mBase = base;
    mProd = 1;
  }

  @Override
  public Z next() {
    final Z result = Fibonacci.fibonacci(mProd);
    mProd *= mBase;
    return result;
  }
}
