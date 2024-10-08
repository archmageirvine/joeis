package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;
import irvine.oeis.a002.A002193;

/**
 * A071901 n-th decimal digit of the fractional part of the square root of the n-th prime.
 * @author Sean A. Irvine
 */
public class A071901 extends A000040 {

  private Z mP;
  private int mN = 0;

  private final class DecimalExpansionOfSqrt extends A002193 {
    @Override
    protected Z n() {
      return mP;
    }

    private Z value() {
      for (int k = 0; k < mN; ++k) {
        super.next();
      }
      return super.next();
    }
  }

  @Override
  public Z next() {
    ++mN;
    mP = super.next();
    return new DecimalExpansionOfSqrt().value();
  }
}

