package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A030000 a(n) is the smallest nonnegative number k such that the decimal expansion of 2^k contains the string n.
 * @author Sean A. Irvine
 * @author Georg Fischer
 */
public class A030000 extends Sequence0 {

  private Z mN = Z.NEG_ONE;
  private final int mBase;

  /** Construct the sequence. */
  public A030000() {
    this(2);
  }

  /**
   * Generic constructor with parameters
   * @param base number base
   */
  public A030000(final int base) {
    mBase = base;
  }

  @Override
  public Z next() {
    mN = mN.add(1);
    final String s = mN.toString();
    Z t = Z.ONE;
    long k = 0;
    while (!t.toString().contains(s)) {
      t = t.multiply(mBase);
      ++k;
    }
    return Z.valueOf(k);
  }
}
