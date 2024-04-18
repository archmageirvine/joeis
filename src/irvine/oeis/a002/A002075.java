package irvine.oeis.a002;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A002075 Number of equivalence classes with primitive period n of base 3 necklaces, where necklaces are equivalent under rotation and permutation of symbols.
 * @author Sean A. Irvine
 */
public class A002075 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A002075(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A002075() {
    super(1);
  }

  private int mN = 0;

  private int hprime(final int d) {
    switch (d % 6) {
      case 0:
        return -6;
      case 3:
        return -3;
      case 1:
    case 5:
      return 1;
    default:
      return -2;
    }
  }

  private int h(final int n) {
    if (n == 1) {
      return 1;
    } else if ((n & (n - 1)) == 0) {
      return -1;
    } else {
      return 0;
    }
  }

  @Override
  public Z next() {
    ++mN;
    Z s = Z.ZERO;
    for (final Z dd : Jaguar.factor(mN).divisors()) {
      final int d = dd.intValue();
      final int mu = Functions.MOBIUS.i((long) d);
      if (mu != 0) {
        final Z t = Z.THREE.pow(mN / d).multiply((long) hprime(d) * mu);
        s = s.add(t);
      }
    }
    s = s.divide(3);
    s = s.add(h(mN));
    return s.divide(2L * mN);
  }
}
