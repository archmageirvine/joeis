package irvine.oeis.a147;

import irvine.math.z.Z;
import irvine.oeis.a051.A051037;

/**
 * A147571 Numbers with exactly 4 distinct prime divisors {2,3,5,7}.
 * @author Georg Fischer
 */
public class A147571 extends A051037 {

  private Z mProd;

  /** Construct the sequence. */
  public A147571() {
    this(new int[] {2, 3, 5, 7});
  }

  /**
   * Generic constructor with parameters
   * @param list divisor list
   */
  public A147571(final int[] list) {
    super(list);
    mProd = Z.ONE;
    for (final int j : list) {
      mProd = mProd.multiply(j);
    }
  }

  @Override
  public Z next() {
    return mProd.multiply(super.next());
  }
}
