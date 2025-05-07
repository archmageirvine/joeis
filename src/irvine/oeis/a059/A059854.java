package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.a003.A003285;

/**
 * A059854 Period of continued fraction for sqrt(n^2+5), n &gt;= 3.
 * @author Sean A. Irvine
 */
public class A059854 extends A003285 {

  /** Construct the sequence. */
  public A059854() {
    super(3);
  }

  {
    mN = 2;
  }

  @Override
  public Z next() {
    return a(Z.valueOf(++mN).square().add(5));
  }
}
