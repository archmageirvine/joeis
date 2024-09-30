package irvine.oeis.a126;

import irvine.math.z.Z;
import irvine.oeis.a000.A000594;

/**
 * A126812 Ramanujan numbers (A000594) read mod 4.
 * @author Georg Fischer
 */
public class A126812 extends A000594 {

  private Z mModulus;

  /** Construct the sequence. */
  public A126812() {
    this(1, 4);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param modulus read tau(n) mod this modulus
   */
  public A126812(final int offset, final long modulus) {
    this(offset, Z.valueOf(modulus));
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param modulus read tau(n) mod this modulus
   */
  public A126812(final int offset, final Z modulus) {
    super();
    mModulus = modulus;
  }

  @Override
  public Z next() {
    final Z result = super.next().mod(mModulus);
    return result.compareTo(Z.ZERO) < 0 ? result.add(mModulus) : result;
  }
}
