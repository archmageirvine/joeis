package irvine.oeis.a090;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A090171 Triangle read by rows, related to Pascal&apos;s triangle read mod 2.
 * T(n, k) = T(n-1, k) + T(n-1, k-1) + T(n-2, k) + T(n-2, k-1) + T(n-2, k-2) for n >= 2, a(0..2) = (0, 1, 0).
 * @author Georg Fischer
 */
public class A090171 extends Triangle {

  protected int mModulus;
  
  /** Construct the sequence. */
  public A090171() {
    this("0, 1, 0", 2);
  }

  /**
   * Generic constructor with parameters
   * @param inits initial terms
   * @param modulo whether to take a modulus at the end
   */
  protected A090171(final String inits, final int modulus) {
    super(inits);
    mModulus = modulus;
  }

  @Override
  protected Z compute(final int n, final int k) {
    Z result = n < 2 
        ? super.compute(n, k) 
        : get(n - 1, k).add(get(n - 1, k - 1)).add(get(n - 2, k)).add(get(n - 2, k - 1)).add(get(n - 2, k - 2));
    if (mModulus > 0) {
      result = result.mod(Z.valueOf(mModulus));
    }
    return result;
  }
}
