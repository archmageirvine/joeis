package irvine.oeis.a147;

import irvine.math.z.Z;
import irvine.oeis.a051.A051037;

/**
 * A147571 Numbers with exactly 4 distinct prime divisors {2,3,5,7}.
 * @author Georg Fischer
 */
public class A147571 extends A051037 {

  private int mN;
  private Z mProd;

  /** Construct the sequence. */
  public A147571() {
    this(new int[] {2, 3, 5, 7});
  }

  /**
   * Generic constructor with parameters
   * @param prod
   */
  public A147571(final int[] list) {
    super(list);
    mN = 0;
    mProd = Z.ONE;
    for (int i = 0; i < list.length; ++i) {
      mProd = mProd.multiply(list[i]);
    }
  }

  @Override
  public Z next() {
    return mProd.multiply(super.next());
  }
}
