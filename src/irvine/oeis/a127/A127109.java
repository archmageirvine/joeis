package irvine.oeis.a127;

import irvine.math.z.Z;
import irvine.oeis.a000.A000142;

/**
 * A127109 n! in base 5.
 * @author Georg Fischer
 */
public class A127109 extends A000142 {

  private int mN;
  private int mBase;

  /** Construct the sequence. */
  public A127109() {
    this(5);
  }

  /**
   * Generic constructor with parameters
   * @param base number base
   */
  public A127109(final int base) {
    mN = -1;
    mBase = base;
  }

  @Override
  public Z next() {
    return new Z(super.next().toString(mBase));
  }
}
