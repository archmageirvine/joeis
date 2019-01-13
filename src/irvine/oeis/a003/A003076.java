package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a002.A002193;

/**
 * A003076.
 * @author Sean A. Irvine
 */
public class A003076 implements Sequence {

  private int mN = -1;

  private final class DecimalExpansionOfSqrt extends A002193 {
    @Override
    protected Z n() {
      return Z.valueOf(mN);
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
    if (++mN == 0) {
      return Z.ZERO;
    }
    return new DecimalExpansionOfSqrt().value();
  }
}

