package irvine.oeis.a144;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A144779 Variant of Sylvester's sequence: a(n+1) = a(n)^2 - a(n) + 1, with a(1) = 5.
 * @author Georg Fischer
 */
public class A144779 extends Sequence1 {

  private Z mA;

  /** Construct the sequence. */
  public A144779() {
    this(5);
  }

  /**
   * Generic constructor with parameters
   * @param start first term, a(1)
   */
  public A144779(final int start) {
    mA = Z.valueOf(start);
    ;
  }

  @Override
  public Z next() {
    final Z result = mA;
    mA = mA.multiply(mA).subtract(mA).add(1);
    return result;
  }
}
