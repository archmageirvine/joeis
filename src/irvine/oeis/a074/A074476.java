package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A074476 Largest prime factor of 3^n + 1.
 * @author Georg Fischer
 */
public class A074476 extends Sequence0 {

  private Z mN;
  private final int mBase;
  private final int mAdd;

  /** Construct the sequence. */
  public A074476() {
    this(3, 1);
  }

  /**
   * Generic constructor with parameters
   * @param base base to be raised to power <code>mN</code>
   * @param add add this to the expression
   */
  public A074476(final int base, final int add) {
    mBase = base;
    mAdd = add;
    mN = Z.ONE;
  }

  @Override
  public Z next() {
    final Z result = Functions.GPF.z(mN.add(mAdd));
    mN = mN.multiply(mBase);
    return result;
  }
}
