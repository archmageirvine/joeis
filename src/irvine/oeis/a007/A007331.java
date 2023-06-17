package irvine.oeis.a007;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A007331 Fourier coefficients of E_{infinity, 4}.
 * @author Sean A. Irvine
 */
public class A007331 extends AbstractSequence {

  /* Construct the sequence. */
  public A007331() {
    super(0);
  }

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN <= 1) {
      return Z.valueOf(mN);
    }
    Z s = Z.ZERO;
    for (final Z d : Jaguar.factor(mN).divisors()) {
      if (((mN / d.longValueExact()) & 1) == 1) {
        s = s.add(d.pow(3));
      }
    }
    return s;
  }
}
