package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a002.A002582;

/**
 * A074477 Largest prime factor of 3^n - 1.
 * @author Georg Fischer
 */
public class A074477 implements Sequence {

  private Z mN;
  private int mBase;
  private int mAdd;

  /** Construct the sequence. */
  public A074477() {
    this(3, -1);
  }

  /**
   * Generic constructor with parameters
   * @param base base to be raised to power <code>mN</code>
   * @param add add this to the expression
   */
  public A074477(final int base, final int add) {
    mBase = base;
    mAdd = add;
    mN = Z.valueOf(mBase);
  }

  @Override
  public Z next() {
    final Z result = A002582.lpf(mN.add(mAdd));
    mN = mN.multiply(mBase);
    return result;
  }
}
