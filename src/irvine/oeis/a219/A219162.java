package irvine.oeis.a219;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A219162 Recurrence equation a(n+1) = a(n)^4 - 4*a(n)^2 + 2 with a(0) = 3.
 * @author Georg Fischer
 */
public class A219162 extends Sequence0 {

  private Z mA;

  /** Construct the sequence. */
  public A219162() {
    this(3);
  }

  /**
   * Generic constructor with parameters
   * @param parm
   */
  public A219162(final int start) {
    mA = Z.valueOf(start);
    ;
  }

  @Override
  public Z next() {
    final Z result = mA;
    mA = mA.pow(4).subtract(mA.multiply(mA).shiftLeft(2)).add(2);
    return result;
  }
}
